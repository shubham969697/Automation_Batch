package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//https://www.sugarcrm.com/au/request-demo/

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		WebElement dd = driver.findElement(By.name("input_8"));
		
		Select select = new Select(dd);
		
		//select.selectByValue("level2");
		Thread.sleep(1000);
		//select.selectByVisibleText("51 - 100 employees");
		Thread.sleep(1000);
		select.selectByIndex(5);
		//Thread.sleep(1000);
		
		
		
	}
	

}
