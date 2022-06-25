package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSE2 {
	public static void main(String[] args) throws InterruptedException {
		String chromedriverpath = System.getProperty("user.dir");
		String driverpath = chromedriverpath +"\\chrome\\chromedriver.exe";
		System.out.println(driverpath);
		String p= System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		WebElement fromCity = driver.findElement(By.xpath("//input[@id='fromCity']"));
		fromCity.sendKeys("BOM, Chhatrapati Shivaji International Airport India");
		WebElement toCity = driver.findElement(By.xpath("//input[@id='fromCity']"));
		fromCity.sendKeys("BOM, Chhatrapati Shivaji International Airport India");
		
		WebElement depDate = driver.findElement(By.xpath("//span[@class='lbl_input latoBold appendBottom10']"));
		depDate.click();
		
	Thread.sleep(5000);
	JavascriptExecutor js = (JavascriptExecutor) driver;  
	
		
	}
}
