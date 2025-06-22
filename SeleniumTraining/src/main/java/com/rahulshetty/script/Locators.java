package com.rahulshetty.script;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Amit");
		driver.findElement(By.name("inputPassword")).sendKeys("Pass");
		driver.findElement(By.className("signInBtn")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Rahul");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("John@rsv.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9970507109");
		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		
		driver.findElement(By.id("inputUsername")).sendKeys("Rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
		driver.findElement(By.xpath("//button[@class='logout-btn']")).click();
	}

}
