package com.script;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HnadlingWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		
		//get total no of windows
		Set<String> allWindow = driver.getWindowHandles();
		System.out.println(allWindow);
		
		Iterator<String> itr = allWindow.iterator();
		String win1 = itr.next();
		String win2 = itr.next();
		
		//print title of parent window
		driver.switchTo().window(win1);
		System.out.println("Parent window are :"+win1);
		System.out.println(driver.getTitle());
		
		//print title of child window
		driver.switchTo().window(win2);
		System.out.println("Child window are "+win2);
		System.out.println(driver.getTitle());
		driver.close();	//close the latest window
		
		//As of driver.quit() will close all the window
		
		
	}

}
