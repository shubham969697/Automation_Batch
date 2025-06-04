package com.selfscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));//frame chya aat jaych
		driver.switchTo().frame(frame);
		
		WebElement source = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		WebElement target = driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).perform();
		
	}

}
