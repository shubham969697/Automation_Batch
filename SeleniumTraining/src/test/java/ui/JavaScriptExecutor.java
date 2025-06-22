package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		//driver.manage().window().maximize();
		
		JavascriptExecutor jExet = (JavascriptExecutor)driver;
		
		//print title of page
		String script = "return document.title;";
		String  title = (String) jExet.executeScript(script);
		System.out.println(title);
		
		//click button
		driver.switchTo().frame("iframeResult");
		jExet.executeScript("myFunction()");
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
		//Highlight button
		WebElement button = driver.findElement(By.xpath("/html/body/button"));
		jExet.executeScript("arguments[0].style.border='5px solid green'", button);
	 
		//scroll
		driver.navigate().to("https://www.w3schools.com/");
		WebElement certificate = driver.findElement(By.xpath("//*[@id=\"getdiploma\"]/div/a"));
		jExet.executeScript("argument[0].scrollIntoView(true);", certificate);
	
	}

}
