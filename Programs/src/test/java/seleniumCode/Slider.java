package seleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		Actions act = new Actions(driver);
		
		 WebElement min_slider = driver.findElement(By.xpath("//div[@class='price-range-block']//span"));
		 act.dragAndDropBy(min_slider, 100, 249).perform();
		 
		 WebElement max_slider = driver.findElement(By.xpath("//span[2]"));
		 act.dragAndDropBy(max_slider, -29, 249).perform();

	}

}
