package com.rahulshetty.script;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingCartItem73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int j=0;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		
		String[] itemList = {"Cucumber","Brocolli","Beetroot"};
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//css selectors- tagName.class-name
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
				
				if(j==3)
					break;
			}
		}
	}

}
