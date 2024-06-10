package seleniumCode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		WebElement Parentframe = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(Parentframe);
		
		WebElement textfield = driver.findElement(By.xpath("//input[@type='text']"));
		textfield.sendKeys("Gyan");
		
		driver.switchTo().frame(0);
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//div[@class='eBFwI']"));
		for (WebElement boxvalue:checkboxes) {
			boxvalue.click();
		}
		
	}

}
