package ecommerce;

import java.util.Arrays;
import java.util.List;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String[] itemsNeeded = { "Cucumber", "Potato", "Beetroot" };
		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/");

		// Sending Array of Products to cart for checkout
		Thread.sleep(5000);
		addItems(driver,itemsNeeded);
	}

	public static void addItems(WebDriver driver, String[] itemsNeeded) {
		int totalItems = itemsNeeded.length;
		int count = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		// format it to get actual name
		// convert array into array list for easy search
		// Check whether name extracted is present in array List or not
		for (int i = 0; i < products.size(); i++) {
			// Cucumber - 1 Kg
			// Cucumber , 1 Kg
			String name = products.get(i).getText().split("-")[0].trim();

			List itemsNeededList = Arrays.asList(itemsNeeded);
			if (itemsNeededList.contains(name)) {
				// Click on add to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				count++;
				if (count == totalItems) {
					break;
				}

			}
		}
	}

}
