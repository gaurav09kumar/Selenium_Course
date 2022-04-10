package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		driver.get("https://www.spicejet.com/");
//		
//		System.out.println(driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1d09ksm r-1inuy60 r-m611by'] //div[@class='css-1dbjc4n r-18u37iz r-1w6e6rj'] //*[local-name()='svg'])[2]")).isSelected());
//		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1d09ksm r-1inuy60 r-m611by'] //div[@class='css-1dbjc4n r-18u37iz r-1w6e6rj'] //*[local-name()='svg'])[2]")).click();
//		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
//		Thread.sleep(2000);
//		System.out.println(driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1d09ksm r-1inuy60 r-m611by'] //div[@class='css-1dbjc4n r-18u37iz r-1w6e6rj'] //*[local-name()='svg'])[2]")).isSelected());
//		
//		count the number of checkboxes
//		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
//		System.out.println(driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-1d09ksm r-1inuy60 r-m611by'] //div[@class='css-1dbjc4n r-18u37iz r-1w6e6rj'] //div[@class='css-76zvg2 r-cqee49 r-n6v787 r-1ozqkpa']")).size());
//		
//		
//		div[@class='css-1dbjc4n r-1d09ksm r-1inuy60 r-m611by'] //div[@class='css-1dbjc4n r-18u37iz r-1w6e6rj'] //div[@class='css-76zvg2 r-cqee49 r-n6v787 r-1ozqkpa']
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		System.out.println(driver.findElement(By.cssSelector("input[value='option1']")).isSelected());
//		driver.findElement(By.cssSelector("input[value='option1']")).click();
//		System.out.println(driver.findElement(By.cssSelector("input[value='option1']")).isSelected());
//		
//		//count the number of checkboxes
//		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
//		
		//validate
		Assert.assertFalse(driver.findElement(By.cssSelector("input[value='option2']")).isSelected());
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='option2']")).click();
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[value='option2']")).isSelected());
		
		driver.close();
	}

}
