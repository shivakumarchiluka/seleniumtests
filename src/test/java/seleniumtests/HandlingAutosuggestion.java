package seleniumtests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingAutosuggestion {

	static WebDriver driver;
	
	public static void main(String[] args) throws Exception {

driver = WebDriverManager.chromedriver().create();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com/");
		
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("balakrishna");
        
		Thread.sleep(2000);
		
	//	String xp = "//span[contains(text(),'selenium')]";
		
		List<WebElement> allSuggestions = driver.findElements(By.xpath("//span[contains(text(),'balakrishna')]"));
		
		int count = allSuggestions.size();
		
		System.out.println(count);
		
		for (int i = 0; i < count; i++) {
			
		WebElement suggestion = allSuggestions.get(i);
		
		String text = suggestion.getText();
		
		System.out.println(text);
		}
		// To click on last suggestion
		allSuggestions.get(count - 1).click();
		}
		

		
	

}
