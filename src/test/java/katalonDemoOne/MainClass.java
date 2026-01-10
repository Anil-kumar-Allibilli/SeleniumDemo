package katalonDemoOne;
import java.time.Duration;
import utile.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		driver.get("https://katalon-demo-cura.herokuapp.com/#appointment");
		Katalon object = new Katalon(driver);
		object.isvisible(PropertyReader.get("makeAppointment"));
		object.click(PropertyReader.get("makeAppointment"));
		object.isvisible(PropertyReader.get("loginLabel"));
		object.isvisible(PropertyReader.get("pleaselogintoMakeAppointment"));
		String usernane = object.saveData(PropertyReader.get("username"));
		String password = object.saveData(PropertyReader.get("password"));
		object.input(PropertyReader.get("userNameField"), usernane );
		object.input(PropertyReader.get("passwordField"), password );
		object.click(PropertyReader.get("loginButton"));
		object.isvisible(PropertyReader.get("makeAppointmentHeader"));
		object.selectdropdown(PropertyReader.get("facilitydropdown"), "Hongkong CURA Healthcare Center");
		object.click(PropertyReader.get("readmissionCheckbox"));
		object.click(PropertyReader.get("healthcareProgram"));		
		String date = object.generateDate();
		object.input(PropertyReader.get("visitdate"), date);
		object.input(PropertyReader.get("comment"), "I want to send the input values");
		object.click(PropertyReader.get("bookAppointmentButton"));
		object.isvisible(PropertyReader.get("AppointmentConfirmation"));
		object.click(PropertyReader.get("goToHomePageButton"));
		driver.quit();
	}

}
