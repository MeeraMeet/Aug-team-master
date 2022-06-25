package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String[] args) throws InterruptedException {
	String chromedriverpath = System.getProperty("user.dir");
	//C:\\Users\\Chaitanya\\eclipse-workspace\\JavaSelenium\\AugTeam\\chrome\\chromedriver.exe
	String driverpath = chromedriverpath +"\\chrome\\chromedriver.exe";
	System.out.println(driverpath);
	
	String p= System.setProperty("webdriver.chrome.driver", driverpath);
	
	// i am going to invoke a webdriver interface and i will start using all the methods(abstract ones for which we will declare the
	//implementations. and this will be implemented by the driver class for which we will give the interface reference.
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.demoqa.com/radio-button");
	// maximizing functionality
	
	driver.manage().window().maximize();
	
	WebElement r = driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
	r.click();
	Thread.sleep(3000);
	driver.quit();
	
}
}