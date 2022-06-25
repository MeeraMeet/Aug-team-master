package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) throws InterruptedException {
		String chromedriverpath = System.getProperty("user.dir");
		String driverpath = chromedriverpath +"\\chrome\\chromedriver.exe";
		System.out.println(driverpath);
		String p= System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		search.sendKeys("chaitanya ravinuthala");
		search.sendKeys(Keys.RETURN); // keyboard action of Enter
			//Explicit wait
		
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		WebElement searchRes = driver.findElement(By.xpath("//h3[@class]"));
//		wait1.until(ExpectedConditions.visibilityOf(searchRes));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'ch')]")));
		System.out.println("waiting done");
		
		
		//Fluent wait
		// Wait wait2 = new FluentWait().withTimeOut().pollingevery().ignoring("Exception")
		
		// PageLoadTimeOut: 
		
		driver.quit();
	}
}
