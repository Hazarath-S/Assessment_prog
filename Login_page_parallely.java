package Assessments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class Login_page_parallely
{
	WebDriver driver;
	
	@Test
	//Using the Parameters Annotation give the Value
	@Parameters("Broswers")
	public void Login_page(String NameoftheBroswer) 
	{
		//Lanch the Multiple Multiple Broswers
		if(NameoftheBroswer.equals("Chrome"))
		{
			driver = new ChromeDriver();
		}
		
		if(NameoftheBroswer.equals("Edge"))
		{
			driver = new EdgeDriver();
		}
		
		if(NameoftheBroswer.equals("FireFox"))
		{
			driver = new FirefoxDriver();
		}
		//Maximize the Window
		driver.manage().window().maximize();
		driver.get("https://app.germanyiscalling.com/common/login/");

		// Using here Implicitywait time.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Finding the Elements of the Login page.

		//Locating the Element By Using the ID Locator
		WebElement Email = driver.findElement(By.id("username"));
		Email.sendKeys("hazarathshaik286@gmail.com");

		//Locating the Element By Using the ID Locator
		WebElement Pwd = driver.findElement(By.id("password"));
		Pwd.sendKeys("Hazarath@123");

		//Locating the Element By Using the Xpath Locator
		WebElement Login_But = driver.findElement(By.xpath("//button[@class ='btn btn-danger mt-3']"));
		Login_But.click();
		
	}

}
