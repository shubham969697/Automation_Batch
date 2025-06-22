package com.rahulshetty.script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String text = "Shubham";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept(); 
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.cssSelector("[id='confirmbtn']")).click();
		
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
	}

}
