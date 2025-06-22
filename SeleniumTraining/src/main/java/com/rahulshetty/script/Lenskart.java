package com.rahulshetty.script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lenskart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.lenskart.com/");//parent window
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='emailOrPhone']")).sendKeys("9623819681");
		
		driver.findElement(By.xpath("//button[@id='remove-button']")).click();
		

	}

}
