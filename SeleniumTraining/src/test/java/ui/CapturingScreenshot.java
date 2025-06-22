package ui;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingScreenshot {

	public static void main(String[] args) throws IOException {
	
		Date cureentDate = new Date();
		System.out.println(cureentDate);
		String ssFileName = cureentDate.toString().replace(" ", "-").replace(":", "-");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com.au/");
		
		//take ss as a date format
		File ss = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ss, new File(".//screenshot//"+ssFileName+".png"));
		
		//take ss as given name
//		File ss = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(ss, new File(".//screenshot/screen.png"));
//				
	}

}
