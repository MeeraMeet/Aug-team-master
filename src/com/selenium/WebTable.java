package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) throws InterruptedException {
		String chromedriverpath = System.getProperty("user.dir");
		String driverpath = chromedriverpath +"\\chrome\\chromedriver.exe";
		System.out.println(driverpath);
		String p= System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/2021_in_film");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		WebElement table = driver.findElement(By.xpath("//table[@class='wikitable sortable jquery-tablesorter'][1]"));
		String tableHeader = "Highest-grossing films of 2021";

		// only for the header Highest grossing films of 2021 we are validating and entering the table to start accessing data

		WebElement tableHeaderUI = driver.findElement(By.xpath("//table[@class='wikitable sortable jquery-tablesorter'][1]/caption"));
		String UItableHeader = tableHeaderUI.getText();
		if(tableHeader.equals(UItableHeader)) // to enter our table that we are validating, we need to compare the headers 
		{
			WebElement tableBody = driver.findElement(By.xpath("//table[@class='wikitable sortable jquery-tablesorter'][1]/tbody"));
			String tbody = tableBody.getText();
			System.out.println("********************");
			System.out.println(tbody);
			System.out.println("********************");
		}

		// table column data
		WebElement tableCol = driver.findElement(By.xpath("//table[@class='wikitable sortable jquery-tablesorter'][1]/tbody/tr/td[1]"));
		String colData = tableCol.getText();
			System.out.println(colData);
		System.out.println("********************");
		driver.quit();
	}

}
