package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.*;

public class BrowserLaunch {
	public static void main(String[] args) throws InterruptedException {
		//we are using chrome browser. so we need chromedriver.exe
		String chromedriverpath = System.getProperty("user.dir");
		//C:\\Users\\Chaitanya\\eclipse-workspace\\JavaSelenium\\AugTeam\\chrome\\chromedriver.exe
		String driverpath = chromedriverpath +"\\chrome\\chromedriver.exe";
		System.out.println(driverpath);
		
		String p= System.setProperty("webdriver.chrome.driver", driverpath);
		
		// i am going to invoke a webdriver interface and i will start using all the methods(abstract ones for which we will declare the
		//implementations. and this will be implemented by the driver class for which we will give the interface reference.
		
		WebDriver driver = new ChromeDriver();
		String browserName = "chrome";
		
		//driver.navigate - will not wait for the page to load. navigate it self says it will provide us the feasibility to move back and forth
		// navigate will also store the data or we can say maintains the browser history.
		//driver.get - wait for the page to load 
		
		driver.navigate().to("https://blazedemo.com/");
		//always ensure that when you load a page or a browser make sure that you are maximizing it. always the best resolution for 
		//ui test would be at the 100%.
		
		driver.manage().window().maximize();
		Thread.sleep(1000); //performance impact
		//waits usually that we have in selenium called implicit and explicit waits. in specific explicit.
		
		//driver.quit and driver.close 
		//.quit -> is like drop table in sql means it kills everything related to the browser
		//.close -> is like just closes that opened browser
		//id, name, clasName, tagName, linkText, PartialLinkText, CSS, Xpath - webelement locators or identifiers
		
		WebElement weblink = driver.findElement(By.linkText("destination of the week! The Beach!"));
		weblink.click();	
		WebElement depCity = driver.findElement(By.xpath("//select[@name='fromPort']"));
		WebElement destCity = driver.findElement(By.xpath("//select[@name='toPort']"));
		WebElement findFlights = driver.findElement(By.xpath("//input[@type='submit']"));
		
		depCity.click();
		Select sel = new Select(depCity);
		sel.selectByValue("Boston");
		
		destCity.click();
		Select sel1 = new Select(destCity);
		sel1.selectByValue("New York");
		
		findFlights.click();
	}

}
