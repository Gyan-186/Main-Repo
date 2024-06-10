package seleniumCode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		
		String year = "2025";
		String month = "August";
		String day = "1";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		while (true)
		{
			String calendermonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String calenderyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")). getText();
			
			if (calenderyear.equals(year) && calendermonth.equals(month))
			{
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();			
		}
		
		List<WebElement>  calenderdate = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//a"));
		
		for (WebElement dateloop : calenderdate)
		{
			if(dateloop.getText().equals(day))
			{
				dateloop.click();
				break;
			}
		}
		
	}

}
