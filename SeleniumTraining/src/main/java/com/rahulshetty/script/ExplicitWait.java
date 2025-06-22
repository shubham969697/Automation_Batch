package com.rahulshetty.script;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); implicit wait
		WebDriverWait w = new WebDriverWait(driver, 5);	//Explicit wait
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		
		String[] itemList = {"Cucumber","Brocolli","Beetroot"};
		
		addItems(driver,itemList);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promocode")));//explicit wait
		
		driver.findElement(By.cssSelector("input.promocode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));	//Explicit wait
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
	}

	public static void addItems(WebDriver driver, String[] itemList)
	{
		int j=0;
		List<WebElement> products =  driver.findElements(By.cssSelector("h4.product-name"));
		

		for(int i=0;i<products.size();i++)
		{
			//Cucumber - 1 Kg
			//in split method string is divided
			//name1[0]=Cucumber and name1[1]= 1kg
			String[] name1 = products.get(i).getText().split("-");
			String formattedName = name1[0].trim();	//remove space from string
			
		
			//convert array into arrayList
			List list = Arrays.asList(itemList);
			

			if(list.contains(formattedName))
			{
				j++;
				
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				
				if(j==itemList.length)
					break;
			}
		}
	}

}
