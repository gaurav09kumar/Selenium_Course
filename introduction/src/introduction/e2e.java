package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		int count = 1;
		while(count<5) {
			driver.findElement(By.id("hrefIncAdt")).click(); //4 times
			count++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		//Check if the departure date is inactive - because its a one way trip
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("Its enabled");
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		//Select the Senior Citizen Discount
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();

		//Currency dropdown with select tag
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(2); //AED
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		Thread.sleep(2000);
		//we can write css if we know Id as below:
		driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
		//customized css
		//driver.findElement(By.cssSelector("(input[value='Search'])[1]")).click();
		
		//customized xpath
		//driver.findElement(By.cssSelector("//input[@value='Search']")).click();
		//driver.findElement(By.cssSelector("//input[@name='ctl00$mainContent$btn_FindFlights']")).click();
		
	}

}
