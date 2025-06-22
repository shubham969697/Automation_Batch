package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.singaporeair.com/en_UK/in/home?gad_source=5&gclid=EAIaIQobChMIgYeK58_FigMVAMw8Ah09lDwpEAAYASAAEgICIfD_BwE&gclsrc=aw.ds#/book/bookflight");
		
		WebElement radio = driver.findElement(By.xpath("//input[@value='redeemFlight']"));
		radio.click();
		System.out.println(radio.isSelected());
		driver.manage().window().maximize();
	}

}
