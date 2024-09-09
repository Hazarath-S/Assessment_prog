package Assessments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginwithInvalidCrendetails 
{
	WebDriver driver;
	@Test
	public void Login_page() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.germanyiscalling.com/common/login/");

		// Using here Implicitywait time.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Finding the Elements of the Login page.

		WebElement Email = driver.findElement(By.id("username"));
		Email.sendKeys("Test.com");

		WebElement Pwd = driver.findElement(By.id("password"));
		Pwd.sendKeys("Test123");

		WebElement Login_But = driver.findElement(By.xpath("//button[@class ='btn btn-danger mt-3']"));
		Login_But.click();
	}
	}


