package ecommerce;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.className("blinkingText")).click();
		
		//shift driver from parent to child
		//Make note of the total windows opened, by taking the window Id of all opened windows
		Set<String> windows = driver.getWindowHandles(); //[parent_id, child_id]
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		
		//String email = driver.findElement(By.cssSelector(".im-para-red")).getText().split("at")[1].trim().split(" ")[0];
		String email = driver.findElement(By.xpath("//p[@class='im-para red'] //a")).getText().trim();
		
		driver.switchTo().window(parentId);
		
		driver.findElement(By.id("username")).sendKeys(email);
	}

}
