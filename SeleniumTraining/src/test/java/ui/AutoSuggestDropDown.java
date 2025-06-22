package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/div/section/span")).click();
//		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[4]/div[2]/p")).click();
//		driver.findElement(By.xpath("//input[@class='font14 fullWidth']")).sendKeys("9970507109");
//		driver.findElement(By.xpath("//button[@class='capText font16']")).click();
		
		
		
		
		driver.findElement(By.xpath("//span[@class = 'commonModal__close']")).click();
		driver.findElement(By.xpath("//span[text()='From']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Dubai");
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
		
		
		
	}

}
