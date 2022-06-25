package com.selenium;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.*;

public class DownloadMech {
	public static void main(String[] args) throws InterruptedException {
		String chromedriverpath = System.getProperty("user.dir");
		String driverpath = chromedriverpath +"\\chrome\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);

		//by default it goes to users/chaitanya/downloads. Because that is what chrome as a capability has so that it downloads the files
		//to the particular location and is set by a property that all downloads are by default to be downloaded in there.

		//I am going to set new download path
		Map<String, Object> path = new HashMap<String, Object>();
		//Understand the separators concept. Delimiters concept. 
		path.put("download.default_directory", System.getProperty("user.dir") + File.separator + "Downloadedfiles");

		// Desired capability to be Set
		ChromeOptions co = new ChromeOptions();
		co.setExperimentalOption("prefs", path);
		//adding my desired capability
		ChromeDriver driver = new ChromeDriver(co);
		driver.get("https://demoqa.com/upload-download");
		driver.manage().window().maximize();
		WebElement download = driver.findElement(By.xpath("//a[@id='downloadButton']"));
		download.click();
		//		driver.quit();

	}
}
