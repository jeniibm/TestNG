package DemoTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void A() {
	 Assert.assertEquals("Vinay", "Jeni"); 
	  
  }
  @Test
  public void B()
  {
	  
  }
  @Test(priority=2)
  public void C()
  {
	  
  }
  @Test(priority=1,dependsOnMethods="A",alwaysRun=true)
  public void D()
  {
	  
  }
  
}
