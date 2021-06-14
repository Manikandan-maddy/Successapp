package extrawork;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driverset {

	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\seleniumdrivers\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://google.co.in");
	}
	
	
	
	
	
	
	
	
	
}
