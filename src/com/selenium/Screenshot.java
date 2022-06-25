package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		String chromedriverpath = System.getProperty("user.dir");
		//C:\\Users\\Chaitanya\\eclipse-workspace\\JavaSelenium\\AugTeam\\chrome\\chromedriver.exe
		String driverpath = chromedriverpath +"\\chrome\\chromedriver.exe";
		System.out.println(driverpath);

		String p= System.setProperty("webdriver.chrome.driver", driverpath);

		// i am going to invoke a webdriver interface and i will start using all the methods(abstract ones for which we will declare the
		//implementations. and this will be implemented by the driver class for which we will give the interface reference.

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.mytime.com/consumers");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.xpath("//input[@id='user_login']"));
		email.sendKeys("anaga.mt@gmail.com");
		Thread.sleep(2000);

		WebElement pwd = driver.findElement(By.xpath("//input[@id='user_password']"));
		pwd.sendKeys("Mytime@123");
		Thread.sleep(2000);
		pwd.clear();
		Thread.sleep(2000);
		pwd.sendKeys("Mytime@123");
		Thread.sleep(2000);

		WebElement signin = driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
		Thread.sleep(3000);

		takeScreenshot(driver, "C:\\Users\\Chaitanya\\OneDrive\\Desktop\\Screenshots\\mytimepage.jpg");
	}
	
	public static void takeScreenshot(WebDriver driver, String filePath) throws IOException
	{
		//converting the webdriver object to take a screenshot
		TakesScreenshot tsc = ((TakesScreenshot)driver);
		// Call getScreenShot method to create the image that you captured
		File fsc = tsc.getScreenshotAs(OutputType.FILE);
		//moving the file to a new destination
		File DestFile = new File(filePath);
		//copy the file to the destination
		FileUtils.copyFile(fsc, DestFile);
	}
}
