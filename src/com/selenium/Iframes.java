package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Iframes {
	public static void main(String[] args) throws InterruptedException {
		String chromedriverpath = System.getProperty("user.dir");
		String driverpath = chromedriverpath +"\\chrome\\chromedriver.exe";
		System.out.println(driverpath);
		String p= System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		//2 ways that we can handles such frames. 1 is java script executor. I will show a normal/usual/routineway
		
		List<WebElement> iframeElements =driver.findElements(By.tagName("iframe"));
		System.out.println("Total number of iframes in the page are: " + iframeElements.size());
		
		// index, name, frameID , WebElement
		//switch to using index
		
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
		
		//driver.switchTo().frame(0); 
		WebElement body = driver.findElement(By.cssSelector("body"));
		System.out.println("Content of the frame is: " + body.getText());
		driver.switchTo().defaultContent();
		
//switchto using id
		driver.switchTo().frame("frame1");
		WebElement body1 = driver.findElement(By.cssSelector("body"));
		System.out.println("Content of the frame is: " + body1.getText());
		driver.switchTo().defaultContent();
		
		driver.quit();
		
		
	}
}