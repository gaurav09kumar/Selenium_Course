package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Invoking Browser
		//Chrome - ChromeDriver -> Methods close get
		//Firefox - FirefoxDriver -> Methods close get
				//Safari - SafariDriver -> Methods close get
		
		//Firefox

		System.setProperty("webdriver.gecko.driver", "/Users/rahulshetty/Documents/geckodriver");

		WebDriver driver1 = new FirefoxDriver();

		//Microsoft Edge

		System.setProperty("webdriver.edge.driver", "/Users/rahulshetty/Documents/msedgedriver");

		WebDriver driver2 = new EdgeDriver();
		//chromedriver.exe -> will invoke Chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
		

	}

}
