package ecommerce;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("learning");
		
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));


		
		driver.findElement(By.id("okayBtn")).click();
		
		driver.findElement(By.cssSelector("option[value='consult']")).click();
		
		driver.findElement(By.id("terms")).click();

		driver.findElement(By.id("signInBtn")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1[class='my-4']")));
		
//		List<WebElement> products = driver.findElements(By.xpath("//h4/a"));
//		
//		for(int i = 1 ; i<=products.size() ; i++) {
//			driver.findElement(By.xpath("(//button[@class='btn btn-info'])" + "[" + i + "]")).click();
//		}
//		
		
		List <WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));

		for(int i =0;i<products.size();i++)

		{

		products.get(i).click();

		}
		
		driver.findElement(By.cssSelector(".nav-link.btn.btn-primary")).click();
		
		System.out.println("Total value is : " + driver.findElement(By.xpath("//h3/strong")).getText().split(" ")[1]);
		
		driver.close();
		
		
	}

}
