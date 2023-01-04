package seleniumtests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Findelements {
	
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		
		
		driver = WebDriverManager.chromedriver().create();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.truepush.com/");
		
		
	List<WebElement> links = 	driver.findElements(By.xpath("//a"));
	
	
	System.out.println(links.size());
	
	for(WebElement ele: links) {
		
		
  //selecting two check boxes
		//
	//	if(ele.getAttribute("id").equals("")||ele.getAttribute("name").equals(""))
		System.out.println(ele.getAttribute("href"));
	}
		
	}

}
