package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	public static void main(String[] args) throws InterruptedException {
		String chromedriverpath = System.getProperty("user.dir");
		String driverpath = chromedriverpath +"\\chrome\\chromedriver.exe";
		System.out.println(driverpath);
		String p= System.setProperty("webdriver.chrome.driver", driverpath);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoqa.com/droppable");
		driver.manage().window().maximize();
		//div[text()='Drag me']
		WebElement dd = driver.findElement(By.xpath("//div[text()='Drag me']"));
	
		new Actions(driver).dragAndDropBy(dd, 350, 10).build().perform();// you will perform an action using build and perform
		Thread.sleep(10000);
		driver.quit();

	}
}