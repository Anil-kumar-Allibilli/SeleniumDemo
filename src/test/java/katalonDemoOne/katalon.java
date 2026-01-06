package katalonDemoOne;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.junit.Assert;
import org.testng.Assert;
public class katalon {
	
	WebDriver driver;
	
	public katalon(WebDriver driver2) {
		this.driver = driver2;
	}
	public void click(By locator)
	{
		try {
		driver.findElement(locator).click();
		System.out.println("Click on:" +locator);
		}
		catch(Exception e)
		{
			System.out.println("Unable to click on: " +locator);
		}
	}
	public boolean isvisible(String locator) 
	{
		try 
		{
			driver.findElement(By.xpath(locator)).isDisplayed();
			return true;
		}
		catch(Exception e)
		{
			System.out.println("unable to find the element:" +locator);
			return false;
		}
	}
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		driver.get("https://katalon-demo-cura.herokuapp.com/#appointment");
		katalon object = new katalon(driver);
		object.isvisible("//a[@id='btn-make-appointment']");
		object.click(By.xpath("//a[@id='btn-make-appointment']"));
	}
}

//	public static void main(String[] args) {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://katalon-demo-cura.herokuapp.com/#appointment");
//		driver.findElement(By.xpath("//a[@id='btn-make-appointmnt']")).isDisplayed();
//		System.out.println("Make Appoinment is visible");
//		driver.findElement(By.xpath("//a[@id='btn-make-appointment']")).click();
//		System.out.println("Click on Make Appointment Buton");
//		driver.findElement(By.xpath(" //h2[normalize-space()='Login']")).isDisplayed();
//		System.out.println("Log in label is visible");
//		driver.findElement(By.xpath("//p[@class='lead']")).isDisplayed();
//		System.out.println("Please login to make appointment is visible");
//		String username = driver.findElement(By.xpath("//input[@value='John Doe']")).getAttribute("value");
//		System.out.println(username);
//		System.out.println("Saved user name: "+ username +" from Demo name field" );
//		String password = driver.findElement(By.xpath("//input[@value='ThisIsNotAPassword']")).getAttribute("value");
//		System.out.println("Saved password: "+ password +" from demo accont");
//		driver.findElement(By.xpath("//input[@id='txt-username']")).sendKeys(username);
//		driver.findElement(By.xpath("//input[@id='txt-password']")).sendKeys(password);
//		driver.findElement(By.xpath("//button[@id='btn-login']")).click();
//		System.out.println("Log in completd Successfully");
//		//log in completed
//		
//		
//		driver.findElement(By.xpath("//h2[normalize-space()='Make Appointment']")).isDisplayed();
//		System.out.println("Make appointmemnt label is visibke");
//		Select select = new Select(driver.findElement(By.xpath("//select[@id='combo_facility']")));
//		select.selectByVisibleText("Hongkong CURA Healthcare Center");
//		driver.findElement(By.xpath("//*[@id=\"chk_hospotal_readmission\"]")).click();
//		System.out.println("click on Apply for check box");
//		driver.findElement(By.xpath("//*[@id=\"radio_program_medicaid\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"txt_visit_date\"]")).sendKeys("26/12/2025");
//		driver.findElement(By.xpath("//*[@id=\"txt_comment\"]")).sendKeys("I want to send the input values");
//		driver.findElement(By.xpath("//*[@id=\"btn-book-appointment\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"summary\"]/div/div/div[1]/h2")).isDisplayed();
//		System.out.println("Appointment Confirmation is visible");
//		driver.findElement(By.xpath("//*[@id=\"summary\"]/div/div/div[7]/p/a")).click();
//		System.out.println("back to home page");
//		driver.close();
//		//lets make all the above code dummy and create new code
//	}
	
	
