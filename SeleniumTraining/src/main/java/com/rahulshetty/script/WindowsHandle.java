package com.rahulshetty.script;
//lecture 89-90
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");//parent window
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@target='_blank'][1]")).click();//child window
		
		Set<String> windows = driver.getWindowHandles();//[parentWindow,childWindow]
		Iterator<String> itr = windows.iterator();
		String parentWindow = itr.next();//itr[0]
		String childWindow = itr.next();//itr[1]
		
		driver.switchTo().window(childWindow);	//go to child window
		
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());//get all paragraph email id wala
		String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];//sglya paragraph mdhla fkt email id ghetla
		
	
		driver.switchTo().window(parentWindow);	//window switch child to parent
		
		driver.findElement(By.id("username")).sendKeys(emailId);	//put kela to child window cha email id parent window chya username la
		
		
		
	}

}
