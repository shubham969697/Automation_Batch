package com.rahulshetty.script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement element = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		Select select = new Select(element);
		select.selectByIndex(3);
		System.out.println(select.getFirstSelectedOption().getText());
		select.selectByVisibleText("AED");
		System.out.println(select.getFirstSelectedOption().getText());
		select.selectByValue("INR");
		System.out.println(select.getFirstSelectedOption().getText());
	}

}
