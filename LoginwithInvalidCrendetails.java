package Assessments;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class LoginwithInvalidCrendetails 
{
	WebDriver driver;
	@Test
	public void Login_page() throws IOException 
	{
		//Lanching the Broswer
		driver = new ChromeDriver();
		//Maximize the Broswer
		driver.manage().window().maximize();
		//Get the URL
		driver.get("https://app.germanyiscalling.com/common/login/");

		// Using here Implicitywait time.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Finding the Elements of the Login page.

		//Locating the Element  By Using the ID Locator
		WebElement Email = driver.findElement(By.id("username"));
		Email.sendKeys("Test.com");

		//Loacting the Element By Using the ID Locator
		WebElement Pwd = driver.findElement(By.id("password"));
		Pwd.sendKeys("Test123");

		//Locating the Element By Using the Xpath Locator
		WebElement Login_But = driver.findElement(By.xpath("//button[@class ='btn btn-danger mt-3']"));
		Login_But.click();
		TakesScreenshot a1 = (TakesScreenshot) driver;
		 File Source = a1.getScreenshotAs(OutputType.FILE);
		 File Destination = new File("C:\\Users\\Hazarath\\Desktop\\Selenium Screenshots\\Pass\\Login.png");
		 FileHandler.copy(Source, Destination);
	}
	}


