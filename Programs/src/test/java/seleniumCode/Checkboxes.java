package seleniumCode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		 List<WebElement> boxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
/*		 
		 for (WebElement value:boxes) {
			 value.click();
		 }
*/		 
		 for (int i=0;i<3;i++) {
			 boxes.get(i).click();
			 
			 if(boxes.get(i).isSelected()) {
				 boxes.get(i).click();
			 }
		 }
		 
		 
	}

}
