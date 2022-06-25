package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.RenderingHints.Key;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
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
		email.clear();
		Robot robot = new Robot();
		email.click();
		//keyPress, KeyEvent, KeyRelease
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyRelease(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_G);
		robot.keyRelease(KeyEvent.VK_G);
		//robot.createScreenCapture(null)
		//robot.createMultiResolutionScreenCapture(null)
		//robot.getPixelColor(0, 0)
		Thread.sleep(5000);
		System.out.println("Keyboard actions are performed");
		Thread.sleep(2000);
		driver.quit();

	}
}
