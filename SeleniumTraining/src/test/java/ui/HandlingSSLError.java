package ui;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandlingSSLError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setAcceptInsecureCerts(true);
		
		ChromeOptions co = new ChromeOptions();
		co.merge(dc);
		ChromeDriver driver = new ChromeDriver(co);
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();
		
		

	}

}
