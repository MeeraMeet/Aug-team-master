package com.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		String chromedriverpath = System.getProperty("user.dir");
		String driverpath = chromedriverpath +"\\chrome\\chromedriver.exe";
		System.out.println(driverpath);

		String p= System.setProperty("webdriver.chrome.driver", driverpath);


		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		String parent = driver.getWindowHandle();
		System.out.println("Parent window is: " + parent);

		Set<String> s = driver.getWindowHandles();
		System.out.println("Child window is: " + s);
		Iterator<String> it = s.iterator();
		while(it.hasNext())
		{
			String cw = it.next();
			System.out.println("Child window is: " +cw);
			if(!parent.equals(cw))
			{
				driver.switchTo().window(cw);
				System.out.println("title of my child window is: " + driver.switchTo().window(cw).getTitle());
				Thread.sleep(3000);
				driver.manage().window().maximize();
				driver.close();
			}
			driver.quit();
		}
	}
}