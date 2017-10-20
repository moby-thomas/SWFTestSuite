package automationFramework;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.ExcelDriver;

public class Login {
	
	WebDriver driver;
	private static Logger Log = LogManager.getLogger(Login.class);
	
	
	@BeforeMethod
	public void setup() {
		
		String url = "https://training-admin.simplyworkflow.com";
		System.setProperty("webdriver.chrome.driver","C:\\TestingDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		DOMConfigurator.configure("log4j2.xml");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
	 }

	
	@Test(dataProvider="getData", enabled=true)
	public void login(String sUserName, String sPassword) throws InterruptedException {
		
		Thread.sleep(2000);
		WebElement element_username = driver.findElement(By.id("txt-username"));
		element_username.clear();
		element_username.sendKeys(sUserName);		
		Log.info("Username entered in the username textbox");		
		
		Thread.sleep(2000);
		WebElement element_password = driver.findElement(By.id("txt-password"));	
		element_password.clear();
		element_password.sendKeys(sPassword);		
		Log.info("Password entered in the password textbox");				
				
		Thread.sleep(3000);	  
		driver.findElement(By.id("inp-submit")).submit();		
		Log.info("Click action performed on the Submit Button");
		
		Thread.sleep(5000);
		WebElement element_job = driver.findElement(By.xpath(".//*[@id='div-header']/div[1]/a/img"));
		Assert.assertTrue(element_job.isDisplayed());		
		Log.info("Signin using valid credentials");		
		Reporter.log("Sig-in Successful");
	}
	
	
	@DataProvider
	public Object[][] getData() {
		
		String sFileName = "C://QA-Workspace//SWFTestSuite//src//testData//TestData.xls";
		String sSheetName = "Sheet1";
		ExcelDriver excel = new ExcelDriver();
		excel.openExcelSheet(sFileName);
		int iRowCount = excel.getRowCountoFSheet(sSheetName);
		
		Object[][] data = new Object[iRowCount][2];
		
		for(int iRow=1; iRow<=iRowCount; iRow++){
			for(int iCell =1; iCell<=2; iCell++){
				data[iRow-1][iCell-1] = excel.getCellData(sSheetName, iRow, iCell);
			}
		}
		
		return data;
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.close();
	}
}
