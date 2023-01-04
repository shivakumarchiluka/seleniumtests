package seleniumtests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboardactions {

	public static void main(String[] args) throws Exception {

		WebDriver driver = WebDriverManager.chromedriver().create();
		
				
		driver.manage().window().maximize();
		
		driver.get("https://app.truepush.com/home/register");

		
		Thread.sleep(3000);

		
		WebElement x = driver.findElement(By.id("name"));
		


		x.sendKeys("SHIVAKUMAR");
		
		


		WebElement x1 = driver.findElement(By.id("email"));
		
		
	//	x1.sendKeys("shivakumar");
		
		Thread.sleep(3000);

		x.sendKeys(Keys.CONTROL,"ac");
		
		Thread.sleep(3000);

		
		x1.sendKeys(Keys.CONTROL,"v");
		
	}

}
