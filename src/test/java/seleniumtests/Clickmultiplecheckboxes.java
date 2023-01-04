package seleniumtests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Clickmultiplecheckboxes {
	
	static WebDriver driver;

	public static void main(String[] args) throws Exception {


	driver = WebDriverManager.chromedriver().create();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		
		
	JavascriptExecutor jsexecuter = (JavascriptExecutor)driver;
		
        jsexecuter.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        
		List<WebElement> cb = driver.findElements(By.xpath("//table[@id='contactList']//following::input[@type ='checkbox']"));
		
		for(int i =0 ;i<cb.size();i++) {
			
			Thread.sleep(2000);
			
			cb.get(i).click();
			
			
		
		}
		
	}

}
