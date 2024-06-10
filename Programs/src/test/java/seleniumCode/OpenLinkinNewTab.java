package seleniumCode;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenLinkinNewTab {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
				
     	WebElement registertab = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
		
		Actions act = new Actions(driver);		
		act.keyDown(Keys.CONTROL).click(registertab).perform();
		
		List<String> windowList = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(windowList.get(1));
		
		
		 driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		 driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("John");
		

	}

}
