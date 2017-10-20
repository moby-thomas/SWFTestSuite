package automationFramework;

import org.testng.annotations.Test;

//import tests.ChromeDriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class TestNG {
	
	public WebDriver driver;
	
	
  @Test
  public void main() {
	  
	  
	  //driver.findElement(By.id("account")).click();
	  
	  driver.findElement(By.id("txt-username")).sendKeys("manager");
	  
	  driver.findElement(By.id("txt-password")).sendKeys("manager");
	  
	  driver.findElement(By.id("inp-submit")).submit();
	  
	  System.out.println(" Login Successfully ....");
	  
	      	  
  }
  
  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println(" Executing from @BeforeSuite Method of TestNG.Java");  
  }
  
  
  @BeforeTest  
  public void beforeTest() {
	  
	  System.out.println(" Executing from @BeforeTest Method of TestNG.Java");  
 
	  
  }

  @BeforeClass
  public void beforeClass() {
  
  	 
	  System.setProperty("webdriver.chrome.driver","C:\\TestingDrivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	  	
	  driver.get("https://training-admin.simplyworkflow.com");	 
    
  }

  @AfterClass
  public void afterMethod() {
	  
	  driver.close();
	  
	  
  }

}
