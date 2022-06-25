package com.selenium;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class WindowRoh {
	public static void main(String[] args) throws InterruptedException {
		// www.teachmeselenium.com/automation-practice/

		String chromedriverpath = System.getProperty("user.dir");
		String driverpath = chromedriverpath +"\\chrome\\chromedriver.exe";
		System.out.println(driverpath);

		String p= System.setProperty("webdriver.chrome.driver", driverpath);


		WebDriver driver = new ChromeDriver();

		driver.get("https://www.teachmeselenium.com/automation-practice/");
		driver.findElement(By.xpath("//a[contains(text(), 'New Window')]")).click();


		// to perform any oprations on windows we need widowID od parent and child windows
		// : This can be acheieved by getWindowHanbles which gives a set (collection) use iterator() to traverse thru set
		// iterator is placed onthe top of collection to move to parentWindowId use it.next();

		Set<String> handles= driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindowId  = it.next();
		System.out.println( " Parent Window ID: " + parentWindowId);
		System.out.println(driver.getTitle());

		String childWindow2Id = it.next();
		System.out.println( " Child Window ID: " + childWindow2Id);

		System.out.println(" switching to child window");

		driver.switchTo().window(childWindow2Id);
		Thread.sleep(5000);
		Select select = new Select(driver.findElement(By.xpath("//div[@class='entry-content']//select[@id='list-second-window']")));
		select.selectByIndex(2);
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(), 'Click Me')]")).click();
		Thread.sleep(5000);
		// i am refreshing it beacuse without it i am getting NoSuchElementException
		handles= driver.getWindowHandles();
		it = handles.iterator();
		String parentWindow = it.next();
		String ChildWindow2Id = it.next();
		String ChildWindow3Id = it.next();
		System.out.println( " 3rd window id : " + ChildWindow3Id);
		driver.switchTo().window(ChildWindow3Id);
		System.out.println(driver.getTitle());
		}
}
