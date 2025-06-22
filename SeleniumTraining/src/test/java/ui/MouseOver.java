package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[7]/a"));//mouse goes to sports
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		
		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[7]/div[2]/div[1]/nav[2]/ul/li[4]/a"));//mouse over to swimming 
		Actions action1 = new Actions(driver);
		action1.moveToElement(element1).perform();
//		driver.findElement(By.xpath("//*[@id=\\\"vl-flyout-nav\\\"]/ul/li[7]/div[2]/div[1]/nav[2]/ul/li[4]/a")).click();
	}

}
