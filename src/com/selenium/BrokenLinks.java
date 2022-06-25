package com.selenium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	public static void main(String[] args) throws InterruptedException {
		String chromedriverpath = System.getProperty("user.dir");
		String driverpath = chromedriverpath +"\\chrome\\chromedriver.exe";
		System.out.println(driverpath);
		String p= System.setProperty("webdriver.chrome.driver", driverpath);
		String homePage = "https://demoqa.com/broken";
		String url = "";
		HttpURLConnection huc = null;
		int respCode = 200;
		WebDriver driver = new ChromeDriver();
		driver.get(homePage);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		Iterator<WebElement> it = links.iterator();
		while(it.hasNext())
		{
			url = it.next().getAttribute("href");
			System.out.println(url);
			
			try {
				huc = (HttpURLConnection) new URL(url).openConnection();
				huc.setRequestMethod("HEAD");
				huc.connect();
				respCode = huc.getResponseCode();
				
				if (respCode>=400)
				{
					System.out.println("The broken url is: " + url);
				}
				else
				{
					System.out.println("URL is valid: " + url );
				}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		Thread.sleep(5000);
		driver.quit();
	}
}