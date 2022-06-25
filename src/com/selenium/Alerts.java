package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {


	public static void main(String[] args) throws InterruptedException {
		String chromedriverpath = System.getProperty("user.dir");
		String driverpath = chromedriverpath +"\\chrome\\chromedriver.exe";
		System.out.println(driverpath);
		String p= System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoqa.com/alerts");
		driver.manage().window().maximize();
		WebElement a = driver.findElement(By.xpath("//button[@id='alertButton']"));
		//button[@id='confirmButton'] - use dismiss method
		a.click();

		Alert al = driver.switchTo().alert();

		String alText = driver.switchTo().alert().getText();
		System.out.println(alText);
		Thread.sleep(3000);
		//for any alert you have either accept or dismiss
		al.accept();
		System.out.println("Alert is accepted which means OK button on Alert is clicked");
		Thread.sleep(3000);
		driver.quit();

	}
}