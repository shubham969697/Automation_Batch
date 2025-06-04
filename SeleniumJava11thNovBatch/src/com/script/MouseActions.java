package com.script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,200)");
		
		Thread.sleep(2000);
		
		WebElement element =  driver.findElement(By.xpath("//button[text()='Double Click Me']"));
		js.executeScript("arguments[0].scrollIntoView()", element);
		
		Thread.sleep(3000);

		//right click
		WebElement element1 = driver.findElement(By.id("rightClickBtn"));
		Actions action = new Actions(driver);
		action.contextClick(element1).perform();
		
		Thread.sleep(3000);

		
		//double click
		WebElement element2 = driver.findElement(By.id("doubleClickBtn"));
		action.doubleClick(element2).perform();
		
		//click
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
	}

}
