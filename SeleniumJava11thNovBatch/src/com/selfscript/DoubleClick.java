package com.selfscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//not executed
public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ADMIN\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		Actions action =  new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']"))).click().sendKeys("Hello").doubleClick().perform();
		

		
	}

}
