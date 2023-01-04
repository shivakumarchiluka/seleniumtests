package seleniumtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown1 {

	static WebDriver driver;
	
	public static void main(String[] args) throws Exception {

		
driver = WebDriverManager.chromedriver().create();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		WebElement elem = driver.findElement(By.id("course"));
		
		Select sel = new Select(elem);
		
		Thread.sleep(2000);

		sel.selectByVisibleText("Java");
		
		Thread.sleep(2000);
			
	}
	

}
