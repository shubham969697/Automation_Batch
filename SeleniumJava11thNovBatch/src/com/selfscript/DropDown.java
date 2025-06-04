package com.selfscript;
//not executed
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
		
		driver.findElement(By.xpath("//a[@data-testid = \"open-registration-form-button\"]")).click();//create new account
		//first method for List
		//List<WebElement> element =  driver.findElements(By.xpath("//select[@id=\"day\"]/option"));//xpath of day
		//System.out.println(element.size());//size 31
		//element.get(5).click();//click 6 day
		
 		//second method for select method:  not execute this method
  		
		WebElement element = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		
		Select select = new Select(element);
		select.selectByIndex(4);
		
		WebElement element1 = driver.findElement(By.xpath("//select[@name=\"birthday_day\"]"));
		Select select1 = new Select(element1);
		select1.selectByIndex(4);
		//select.selectByValue("1");
		//select.selectByVisibleText("May");
		WebElement element2 = driver.findElement(By.xpath("//select[@name=\"birthday_year\"]"));
		Select select2 = new Select(element2);
		select2.selectByIndex(4);
		
		driver.findElement(By.xpath("//input[@value=\"2\"]")).click();
		

	}
}
