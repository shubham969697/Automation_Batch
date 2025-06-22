package ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com.au/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	//implicite wait
		WebElement element = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[6]/a"));//mouse goes to sports
		
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[6]/div[2]/div[1]/nav[2]/ul/li[2]/a")).click();
		
	}

}
