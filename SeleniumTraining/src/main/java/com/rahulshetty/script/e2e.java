package com.rahulshetty.script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
		int i=1;
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
	}

}
