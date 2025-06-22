package com.rahulshetty.script;
//lecture-94,95,97

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount94 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		System.out.println(driver.findElements(By.tagName("a")).size());//total link count in page
		
		WebElement footer = driver.findElement(By.id("gf-BIG"));//footer cha path
		System.out.println(footer.findElements(By.tagName("a")).size());//footer mdhlya link cha count
		
		WebElement columndriver = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));//footer mdhlya 1st column cha path
		System.out.println(columndriver.findElements(By.tagName("a")).size());	//1st column cha count
		
		//click on each link in the column and check if pages are opening
		for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
		{
			String clickonlink = Keys.chord(Keys.CONTROL,Keys.ENTER);//press control key and then enter
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);//anchor tag la click 4 tab open hotil
			Thread.sleep(5000);
		}	
			Set<String> abc = driver.getWindowHandles();//it handles mmultiple window
			Iterator<String> itr = abc.iterator();
			
			while(itr.hasNext())//hasNext check next condition is present or not
			{
				driver.switchTo().window(itr.next());
				System.out.println(driver.getTitle());
				
			}
		}
	
}


