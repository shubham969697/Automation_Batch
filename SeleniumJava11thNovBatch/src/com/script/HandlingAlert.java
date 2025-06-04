package com.script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@id=\"confirmButton\"]")).click();
		
		//alert handling (Accept the alert)
		driver.switchTo().alert().accept();
		System.out.println("Alert will accept");
		
		driver.findElement(By.xpath("//button[@id=\"confirmButton\"]")).click();
		//alert handling (dismiss the alert)
		driver.switchTo().alert().dismiss();
		System.out.println("Alert will dismiss");
	}

}
