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

public class Loginwithvalidcredentails
{
	WebDriver driver;

	@Test
	public void Loginpage() throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.germanyiscalling.com/common/login/");

		// Using here Implicitywait time.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Finding the Elements of the Login page.

		WebElement Email = driver.findElement(By.id("username"));
		Email.sendKeys("hazarathshaik286@gmail.com");

		WebElement Pwd = driver.findElement(By.id("password"));
		Pwd.sendKeys("Hazarath@123");

		WebElement Login_But = driver.findElement(By.xpath("//button[@class ='btn btn-danger mt-3']"));
		Login_But.click();
		
		//After Login With the Proof of Maintaining the  Screenshots of the Login.
		 TakesScreenshot A1 = (TakesScreenshot) driver;
		File Source =  A1.getScreenshotAs(OutputType.FILE);
		 File Destination = new File("C:\\Users\\Hazarath\\Desktop\\Selenium Screenshots\\Pass\\Login.png");
		FileHandler.copy(Source, Destination);
		
		
	}
}
