package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCap {

	public static void main(String[] args) throws InterruptedException {
		String chromedriverpath = System.getProperty("user.dir");
		String driverpath = chromedriverpath +"\\chrome\\chromedriver.exe";
		System.out.println(driverpath);
		String p= System.setProperty("webdriver.chrome.driver", driverpath);
		
		DesiredCapabilities cap = new DesiredCapabilities();
		// you would want to proceed to a website and most of the times you say get an error "Your connection is not private"
		// You can not go that site. FOr going, click on the advanced setting in the page and then proceed.
		cap.setAcceptInsecureCerts(true);
		//cap.setCapability(p, true);// another way	
		
		//WebDriver driver = new ChromeDriver(); // general use that we were doing till yest class
		
	//	WebDriver driver1 = new ChromeDriver(cap); // all of sudden started seeing this
		 
		ChromeOptions opt = new ChromeOptions(); //further moved to this feature
		
		opt.addArguments("--start-maximized");
		//opt.addArguments("--incognito");
		opt.addArguments("--disable-infobar");
		//opt.addArguments("headless");
		//opt.setHeadless(true);
		
		opt.merge(cap);
		WebDriver driver2 = new ChromeDriver(opt); // to this and started passing the the options that we define.
		
		driver2.get("http://google.com");
		Thread.sleep(3000);
		
		
		
		

	}

}
