package DemoTestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Demo1 {
	@BeforeSuite
	public void BS()
	{
		System.out.println("This is first");
	}
	@BeforeTest
	public void BT()
	{
		System.out.println("This will execute before all classes demo1");
	}
  @Test
  public void Testcase1() {
	  System.out.println("This will execute my first test");
  }
  @Test
  public void Testcase2() {
	  System.out.println("This will execute my Second test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This will execute before each method");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This will execute after each method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This will execute before class demo1");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This will execute after class demo1");
  }

  @AfterTest
  public void AT()
  {
	  System.out.println("This will execute after all classes demo1");
  }
  
  @AfterSuite
  public void AS()
	{
		System.out.println("This is last");
	}
  
}
