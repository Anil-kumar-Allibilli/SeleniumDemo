package katalonDemoOne;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
public class Katalon {
	
	WebDriver driver;
	
	public Katalon(WebDriver driver2) {
		this.driver = driver2;
	}
	public void click(String locator)
	{
		try {
		driver.findElement(By.xpath(locator)).click();
		System.out.println("Click on :" +locator);
		}
		catch(Exception e)
		{
			System.out.println("Unable to click on : " +locator);
		}
	}
	public boolean isvisible(String locator) 
	{
		try 
		{
			driver.findElement(By.xpath(locator)).isDisplayed();
			System.out.println(locator+ " is visible");
			return true;
		}
		catch(Exception e)
		{
			System.out.println("unable to find the element :" +locator);
			System.out.println(locator+ " is not visible");
			return false;
		}
	}
	public String saveData(String data)
	{
		try {
		String varibletostore = driver.findElement(By.xpath(data)).getAttribute("value");
		System.out.println(varibletostore);
		return varibletostore;
		}
		catch(Exception e)
		{
			return "unable to find the element:\" +data" +data;
		}
	}
	public void input(String field, String inputvalue)
	{
		try
		{
			driver.findElement(By.xpath(field)).sendKeys(inputvalue);
			
		}
		catch(Exception e)
		{
			System.out.println("Unable to find the element: " +field+ "to input");
		}
	}
	public void selectdropdown(String fielddropdown, String value)
	{
		try
		{
			Select select = new Select(driver.findElement(By.xpath(fielddropdown)));
			select.selectByVisibleText(value);
		}
		catch(Exception e)
		{
			System.out.println("Unable to select the " +value+ "from " +fielddropdown);
		}
	}
	public String generateDate()
	{
		LocalDate date = LocalDate.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String generatedDate = date.format(format);
		System.out.println(date);
		return generatedDate;
	}
}


	
	
