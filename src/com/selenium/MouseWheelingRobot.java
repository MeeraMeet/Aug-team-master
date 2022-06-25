package com.selenium;

import java.awt.AWTException;
import java.io.IOException;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.RenderingHints.Key;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseWheelingRobot {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		String chromedriverpath = System.getProperty("user.dir");
		//C:\\Users\\Chaitanya\\eclipse-workspace\\JavaSelenium\\AugTeam\\chrome\\chromedriver.exe
		String driverpath = chromedriverpath +"\\chrome\\chromedriver.exe";
		System.out.println(driverpath);
		String p= System.setProperty("webdriver.chrome.driver", driverpath);
		// i am going to invoke a webdriver interface and i will start using all the methods(abstract ones for which we will declare the
		//implementations. and this will be implemented by the driver class for which we will give the interface reference.
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");
		driver.manage().window().maximize();
		Robot rob = new Robot();
		rob.mouseWheel(10);
		Thread.sleep(5000);
		System.out.println("Mouse wheeled down");
		rob.mouseWheel(-10);
		Thread.sleep(5000);
		System.out.println("Mouse wheeled up");
		Thread.sleep(5000);
		driver.quit();
	}
}