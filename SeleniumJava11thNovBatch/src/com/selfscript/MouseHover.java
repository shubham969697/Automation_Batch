package com.selfscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
		
		WebElement element = driver.findElement(By.xpath("//a[@_sp=\"p4375194.m1384.l3250\"]"));//xpath for health and beauty
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(5000);
		
		WebElement element2 = driver.findElement(By.xpath("//a[text()=\"Massagers\"]"));//in health and beauty massagers xpath
		action.moveToElement(element2).perform();
		Thread.sleep(3000);
		System.out.println("Hi");
	}

}
