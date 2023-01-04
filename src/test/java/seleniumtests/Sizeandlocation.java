package seleniumtests;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sizeandlocation {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = WebDriverManager.chromedriver().create();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://app.truepush.com/home/register");

		
		Thread.sleep(3000);

		
		WebElement ele1 = driver.findElement(By.id("name"));
		
	Dimension size = 	ele1.getSize();
	
int  h = size.getHeight();

int w = size.getWidth();

System.out.println(h+" "+w);
		

//to get location of the element

		WebElement ele2 = driver.findElement(By.id("email"));
		
		
	Point p =	ele2.getLocation();
	
	int x = p.getX();
	
	int y = p.getY();
	
	System.out.println(x+"   "+y);
		
	String color =	ele2.getCssValue("color");
		
		System.out.println(color);
         
	}

}
