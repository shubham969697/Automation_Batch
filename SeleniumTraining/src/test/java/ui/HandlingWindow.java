package ui;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver.", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/au/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"1727194472988_l1b\"]/div[1]/article/div[2]/div/pbc-button[1]/a")).click();
		
		Set<String> windowHandle = driver.getWindowHandles();
		System.out.println(windowHandle);
		
		Iterator<String> itr = windowHandle.iterator();
		String parentWindow = itr.next();
		System.out.println(parentWindow);
		String childWindow = itr.next();
		System.out.println(childWindow);

		driver.switchTo().window(childWindow);
		driver.findElement(By.name("UserFirstName")).sendKeys("PVR");
		driver.findElement(By.name("UserLastName")).sendKeys("Inox");
		driver.switchTo().window(parentWindow);
		
		//driver.manage().window().minimize();
		
	}

}
