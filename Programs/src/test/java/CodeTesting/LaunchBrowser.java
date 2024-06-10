package CodeTesting;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class LaunchBrowser {

	public static void main(String[] args) {
		
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		
		 WebElement tileofPage = driver.findElement(By.xpath("//*[title='Your Store']"));
		 
		 String title = tileofPage.getText();
		 
		 assertEquals(title, "Your Store");
		 
		
		
		driver.quit();

	}

}
