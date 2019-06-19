package DemoTestNG;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo2 {

	
	@AfterClass
	public void AC() {
		  System.out.println("This will execute after class demo2");
	  }
	@BeforeClass
	public void BC() {
		  System.out.println("This will execute before class demo2");
	  }

	@Test
  public void Testcase3() {
		System.out.println("This will execute my Third test");
  }
}
