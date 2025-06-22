package ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEventDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://extendsclass.com/text-compare.html");
		driver.manage().window().maximize();
		WebElement sourcetextarea = driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[6]/pre"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		//Thread.sleep(2000);
		action.keyDown(sourcetextarea, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[7]/pre"));
		//Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		action.keyDown(ele, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
	}

}
