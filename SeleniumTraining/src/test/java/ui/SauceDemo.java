package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver.", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.findElement(By.id("input_1_3_3")).sendKeys("Testing");
		driver.findElement(By.id("input_1_3_3")).clear();
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.id("input_1_3_3")).getAttribute("type"));
		System.out.println(driver.findElement(By.xpath("//*[@id=\"gform_submit_button_1\"]")).getCssValue("text-transform"));
		System.out.println(driver.findElement(By.xpath("//*[@id=\"gform_submit_button_1\"]")).getSize());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"gform_submit_button_1\"]")).getLocation());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"gform_submit_button_1\"]")).getTagName());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"gform_submit_button_1\"]")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"gform_submit_button_1\"]")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"gform_submit_button_1\"]")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"gform_submit_button_1\"]")).isSelected());




		
		


		
	}

}
