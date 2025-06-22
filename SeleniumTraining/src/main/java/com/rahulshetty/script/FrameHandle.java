package com.rahulshetty.script;
//lecture- 92,93

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());//wesite vr kiti frame ahet te display hot
		
		//css selectors: 1).classname
		//				 2) tagName[attributeName='value']
		// 3 types of frame : index,webelement, string
		
		WebElement  frame = driver.findElement(By.cssSelector(".demo-frame"));//main frame cha xpath
		//driver.switchTo().frame(frame);//frame mddhe enter honyasathi method
		driver.switchTo().frame(0);
		//driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		WebElement source = driver.findElement(By.id("draggable"));//xpath for drag
		WebElement target = driver.findElement(By.id("droppable"));//xpath for drop
		
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).perform();
		
		driver.switchTo().defaultContent();	//drop zhalyavr frame chya baher jat, ani dusre action perform krt
		
	}

}
