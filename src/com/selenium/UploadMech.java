package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadMech {

	public static void main(String[] args) throws InterruptedException {
		String chromedriverpath = System.getProperty("user.dir");
		String driverpath = chromedriverpath +"\\chrome\\chromedriver.exe";
		System.out.println(driverpath);
		String p= System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/upload-download");
		driver.manage().window().maximize();
		WebElement upload = driver.findElement(By.id("uploadFile"));
		//Usually we will enter the file path from where we trigger the upload file
		upload.sendKeys("C:\\Users\\Chaitanya\\SeleniumFiles\\chaitanya.jpeg");
		Thread.sleep(5000);
		driver.quit();
	}
}