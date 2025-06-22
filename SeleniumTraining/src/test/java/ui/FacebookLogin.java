package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/?stype=lo&flo=1&deoia=1&jlou=AffH1ofu4VdUmLzary9T1Is5SYFzIrapJ-Y7jF7TBRC-VnebPcO_wpJ7UrZy___HjFqLRjnYVkxkXojew-RORDVQX3ipn58-mwdC1fIEYno1fg&smuh=27160&lh=Ac-iDCOgSsRw7AqIYMA");
		//driver.findElement(By.id("email")).sendKeys("9970507109");
		//driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("9970507109");
		//driver.findElement(By.id("pass")).sendKeys("Pass@123");
		
		//driver.findElement(By.name("login")).click();
		driver.manage().window().maximize();
		driver.navigate().to("http://google.com");
		driver.close();
	}

}
