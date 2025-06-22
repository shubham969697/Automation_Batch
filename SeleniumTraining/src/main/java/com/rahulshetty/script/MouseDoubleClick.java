package com.rahulshetty.script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.com/");
		
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Mobile").doubleClick().contextClick().build().perform();//mouse go to search click and type mobile
	
		//action.doubleClick(driver.findElement(By.id("twotabsearchtextbox"))).perform(); // double click on that text
		//action.contextClick(driver.findElement(By.id("twotabsearchtextbox"))).perform();//right click
		
	
	}

}
