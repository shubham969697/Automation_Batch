package com.script;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Create new account']")).click();	//create new account
		
		//dropdown for BirthMonth
		List<WebElement> BirthMonth = driver.findElements(By.xpath("//*[@name=\"birthday_month\"]/option"));//month
		System.out.println(BirthMonth.size());
		Thread.sleep(2000);
		BirthMonth.get(5).click();
		Thread.sleep(3000);
		
		//dropdown for BirthYear
		List<WebElement> BirthYear =   driver.findElements(By.xpath("//select[@name=\"birthday_year\"]/option"));
		System.out.println(BirthYear.size());
		Thread.sleep(2000);
		BirthYear.get(5).click();
		//driver.quit();
		
		//dropdown for BirthDay
		List<WebElement> BirthDay = 	driver.findElements(By.xpath("//select[@name=\"birthday_day\"]/option"));
		System.out.println(BirthDay.size());
		BirthDay.get(5).click();
	
	}

}
