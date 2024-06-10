package seleniumCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTabsorWindow {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		driver.switchTo().newWindow(WindowType.TAB); //open in new tab
		driver.get("https://www.flipkart.com/");
		
		driver.switchTo().newWindow(WindowType.WINDOW); //open in new window
		
		driver.get("https://www.facebook.com/");

	}

}
