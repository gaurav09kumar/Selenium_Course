package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentUI {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys("John Mathew");
		driver.findElement(By.xpath("(//input[@name='email'])")).sendKeys("john@abc.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("demoPass12");
		driver.findElement(By.id("exampleCheck1")).click();
		driver.findElement(By.xpath("//option[1]")).click();
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("23/05/1997");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
		
		driver.close();
	}

}
