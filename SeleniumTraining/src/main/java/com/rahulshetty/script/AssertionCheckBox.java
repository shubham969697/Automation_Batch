package com.rahulshetty.script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class AssertionCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.getTitle());
		Assert.assertFalse( driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		Assert.assertTrue( driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	
		Assert.assertEquals(driver.getTitle(), "QAClickJet - Flight Booking for Domestic and International, Cheap Air Tickets");
		
		
	}

}
