package seleniumtests;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selecttwovalues {
	
	static WebDriver driver;

	public static void main(String[] args) throws Exception {


		driver = WebDriverManager.chromedriver().create();
			
			driver.manage().window().maximize();
			
			driver.manage().deleteAllCookies();
			
			driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
			
			
			JavascriptExecutor jsexecuter = (JavascriptExecutor)driver;
			
	        jsexecuter.executeScript("window.scrollBy(0,1000)");
	        
			
			for(int i = 1;i<=2;i++) {
				
				

	driver.findElement(By.xpath("//table[@id='contactList']//following::input["+i+"]")).click();

                    

		Thread.sleep(2000);

					
								
				
				
				
			}
		
	}

}
