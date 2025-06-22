package ui;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com.au/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	//implicite wait
		WebElement element = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[6]/a"));//mouse goes to sports
		
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		
		Wait<WebDriver> wait =  new FluentWait()
							.withTimeout(Duration.ofSeconds(10))
							.pollingEvery(Duration.ofSeconds(2))
							.withMessage("RCV")
							.ignoring(NoSuchElementException.class);
		
		//WebDriverWait wait = new  WebDriverWait(driver, 10);	//Explicit wait
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"vl-flyout-nav\\\"]/ul/li[6]/div[2]/div[1]/nav[2]/ul/li[2]/a"))).click();
		
	}

	private org.openqa.selenium.support.ui.FluentWait<WebDriver> withTimeout(Duration ofSeconds) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
