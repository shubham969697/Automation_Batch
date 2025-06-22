package com.rahulshetty.script;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderTest99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String date = "18";
		String month = "1";
		String year = "2030";
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();//click on below date
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();//click on month 
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();//click on year
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();//chose specific year
		driver.findElements(By.cssSelector(".react-calendar__tile")).get(Integer.parseInt(month)-1).click();//for month but List will start from 0,so put -1
		driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();//for date
		
		//System.out.println(driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).getText());//aleli date print keli but full yet nhiye
		
		List<WebElement> actualList = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));//full date cha path 3 matching
		
		for(int i=0;i<actualList.size();i++)//0,1,2
		{
			System.out.println(actualList.get(i).getAttribute("value"));	//value common ahe so value nusar display kel
		}
		
		
	}

}
