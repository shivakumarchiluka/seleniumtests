package seleniumtests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown2 {

	static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		
driver = WebDriverManager.chromedriver().create();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		List <WebElement> elem = driver.findElements(By.id("course"));
		
		for(WebElement e :elem) {
			
			Select nt = new Select(e);
			
			nt.selectByValue("java");
			
			
			Thread.sleep(2000);
			
		}
	}

}
