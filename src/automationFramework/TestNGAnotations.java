package automationFramework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGAnotations {
	
	
  @Test (dependsOnMethods = { "testCase2" }) 
  public void testCase1() {
	  System.out.println("@Test : testCase1 --> This is the Test Case 1");
	  System.out.println("@Test method Executing after method testCase2");
  }
  
  @Test
  public void testCase2() {
	  System.out.println("@Test : testCase2 --> This is the Test Case 2");
	  System.out.println("@Test method testcase2 executing first");
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("@BeforeMethod ---> This will execute before every method");
  }

  
  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("@AfterMethod ---> This will execute after every method");
  }

  
  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("@BeforeClass ---> This will execute before the Class");
  }

  
  @AfterClass
  public void afterClass() {
	  
	  System.out.println("@AfterClass ---> This will execute after the Class");
  }

  
  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("@BeforeTest ---> This will execute before the Test");
  }
  

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("@AfterTest ---> This will execute after the Test");
  }
  

  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("@BeforeSuite ---> This will execute before the Test Suite");
  }

  
  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println("@AfterSuite ---> This will execute after the Test Suite");
  }

}
