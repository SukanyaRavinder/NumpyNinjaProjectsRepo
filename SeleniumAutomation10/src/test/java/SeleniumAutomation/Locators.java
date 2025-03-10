package SeleniumAutomation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Locators {
	
		
		WebDriver driver = null;
		

		
	  @Test
	  public void locatorsbyvalue () throws InterruptedException {
		  
		 
			  
			  WebElement userName = driver.findElement(By.id("txtUsername"));
			   userName.click();
			   userName.sendKeys("Admin");
			   Thread.sleep(3000);
			      
			   driver.findElement(By.name("txtPassword")).click();
			   driver.findElement(By.name("txtPassword")).sendKeys("admin123");
			   Thread.sleep(3000);
			   
			   
			   driver.findElement(By.className("button")).click();
			   Thread.sleep(3000);
			 
			   WebDriverWait wait = new WebDriverWait(driver, 10);
			   WebElement messageElement = wait.until(
			          ExpectedConditions.presenceOfElementLocated(By.id("loginResponse")) ; 

			   // Run a test
			   String message              = messageElement.getText();
			   String successMsg      = "Welcome to foo. You logged in successfully.�;
			   Assert.assertEquals (message, successMsg); 
			  
		
		
	  }
	  @BeforeTest
	  public void beforeTest() throws InterruptedException {
		  
		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		  driver = new ChromeDriver();
		  
		//   driver.get("https://www.google.com/");
		   
		   driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		   
		  
		   Thread.sleep(3000);
		   
		   driver.manage().window().maximize();
	  }

	  @AfterTest
	  public void afterTest() {
		  
		  driver.close();
		  driver.quit();
	  }

	}
