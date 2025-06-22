package ui;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthenticationDemo {

	public static String username = "admin";	//reading from external XLS or CSV
	public static String password = "admin";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//only changes in username and pass put in URL
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		//handle in external data
		driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");

		

	}

}
