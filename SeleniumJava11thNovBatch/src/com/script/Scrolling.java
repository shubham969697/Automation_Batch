package com.script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//1.using pixel scroll down
		js.executeScript("window.scrollBy(0,500)");
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(5000);
		//scroll up
		js.executeScript("window.scrollBy(0,-500)");
		
		//till webelement scoll down
		Thread.sleep(3000);
		
		WebElement element= driver.findElement(By.xpath("//img[@alt='Selenium Online Training']"));
		js.executeScript("arguments[0].scrollIntoView()", element);
		
		Thread.sleep(3000);
		//scroll to bottom of page
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	}

}
