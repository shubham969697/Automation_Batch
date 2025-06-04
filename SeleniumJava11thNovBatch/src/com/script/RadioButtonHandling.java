package com.script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Create new account']")).click();	//create new account
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value=\"-1\"]")).click();	//custom
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value=\"1\"]")).click();	//female
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value=\"2\"]")).click();	//male
	}

}
