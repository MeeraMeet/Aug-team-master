package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExe {
	
	public static void main(String[] args) throws InterruptedException {
		String chromedriverpath = System.getProperty("user.dir");
		String driverpath = chromedriverpath +"\\chrome\\chromedriver.exe";
		System.out.println(driverpath);
		String p= System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://freecrm.com");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		WebElement loginBtn = driver.findElement(By.xpath("//span[contains(text(), 'Log In' )]"));
		Thread.sleep(5000);
		highlight(driver, loginBtn);
	}
		
		public static void highlight(WebDriver driver, WebElement element) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("window.scrollBy(0,600)", "" ); //page scroll action
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-600)", "" );
		Thread.sleep(3000);
		
		String bgcolor = element.getCssValue("backgroundColor");
		System.out.println(bgcolor);
		
		for(int i =0; i<10; i++)
		{
			changecolor("rgb(0,200,0)", element,driver);
			Thread.sleep(10000);
			changecolor(bgcolor, element, driver);
			
		}
		}
		
		public static void changecolor(String color, WebElement element, WebDriver driver)
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			//((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
			js.executeScript("arguments[0].style.backgroundColor='"+color+"'", element);
			//js.executeScript("document.getElementByID().click();");tsr
			//js.executeScript("document.getElementByID().value='ichaitanya';");
			//js.executeScript("location.reload()");
try
{
	Thread.sleep(3000);
}
catch (Exception e) {
	// TODO: handle exception
}
		}
		
	}


