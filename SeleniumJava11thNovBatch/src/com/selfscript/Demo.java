package com.selfscript;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.naukri.com/nlogin/login?URL=https://www.naukri.com/mnjuser/homepage");
		Thread.sleep(3000);
		driver.navigate().to("https://www.qspiders.com/");
		Thread.sleep(3000);
		//driver.quit();	//close all window
		
		//driver.switchTo().activeElement().sendKeys("Java",Keys.ENTER);
		//Thread.sleep(3000);

//		driver.navigate().back();
//		Thread.sleep(3000);
//
//		driver.navigate().forward();
//		Thread.sleep(3000);
//
//		driver.navigate().refresh();
//		Thread.sleep(3000);

		driver.close();
	}

}
