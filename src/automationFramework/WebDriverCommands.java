package automationFramework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.xalan.xsltc.DOM;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.html.DomElement;

public class WebDriverCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();

		String url = "https://training-admin.simplyworkflow.com";

		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='content']/p[4]/button")).click();
		
		Alert simpleAlert = driver.switchTo().alert();
		
		String alertText = simpleAlert.getText();
		
		System.out.println("Alert text is " + alertText);
		
		simpleAlert.accept();	
		
		
		
 
		/*System.out.println("The Page Title Length is " + driver.getTitle().length());

		System.out.println("The total length of the page source is " + driver.getPageSource().length());
		
		
		//WebElement element = document.forms[0].
		
		WebElement element_username = driver.findElement(By.id("txt-username"));
		element_username.sendKeys("test");
		
		WebElement element_password = driver.findElement(By.id("txt-password"));
		element_password.sendKeys("test");
		
		
		DomElement element_username1 = document.forms["form-login"].elements["txt-username"];
		
		
		
		driver.findElement(By.id("inp-submit")).submit();
		
		*/
		

		driver.close();
		
		
		/*driver.get("http://toolsqa.wpengine.com/Automation-practice-form/");
		
		driver.findElement(By.name("firstname")).sendKeys("Moby");
		
		driver.findElement(By.name("lastname")).sendKeys("Thomas");
		
		driver.findElement(By.id("submit")).click();
		
		WebElement element = driver.findElement(By.name("firstname"));
		element.sendKeys("Moby");
		
		WebElement element1 = driver.findElement(By.name("lastname"));
		element1.sendKeys("Thomas");
		
		driver.findElement(By.id("submit")).click();
		
		driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().to("http://demoqa.com");
		
		driver.navigate().refresh();
		
		
		Select oSelect = new Select(element);
		
		oSelect.
		
		driver.close();
				
		*/
	
		
		
		
		/*WebDriver driver = new FirefoxDriver();
		
		driver.get("http://toolsqa.wpengine.com/automation-practice-form");
		
		Select oSelect = new Select(driver.findElement(By.id("continents")));
		
		oSelect.selectByVisibleText("Europe");
		
		try {
		Thread.sleep(2000);
		}
		catch(Exception e)
		{e.getMessage();}
		
		oSelect.selectByIndex(2);
		
		try {
			Thread.sleep(2000);
			}
			catch(Exception e)
			{e.getMessage();}
		
		List<WebElement> oSize = oSelect.getOptions();
		
		int iListSize = oSize.size();
		
		try {
			Thread.sleep(2000);
			}
			catch(Exception e)
			{e.getMessage();}
		
			
		for (int i=0; i< iListSize; i++) 
		{
			System.out.println(oSelect.getOptions().get(i).getText());
			
			if (oSelect.getOptions().get(i).getText().equals("Africa"))
			{
				oSelect.selectByIndex(i);
				break;
				
			}
		}
		
		driver.close();*/
		
		
		
		
	/*	WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://toolsqa.wpengine.com/automation-practice-table");
		
		String sCellValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[6]/a")).getText();
		
		System.out.println(sCellValue);
		
		driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[6]/a")).click(); 
		
		try {
			Thread.sleep(10000);
			}
			catch(Exception e)
			{e.getMessage();}
		
		
		System.out.println("Link has been clicked otherwise an exception would have thrown");*/
		
		
		
		driver.close();
		
		
		
	}
	

}
