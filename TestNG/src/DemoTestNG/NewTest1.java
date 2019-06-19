package DemoTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test(priority=2)
  public void A() {
	 Assert.assertEquals("Vinay", "Jeni"); 
	  
  }
  @Test(priority=3,dependsOnMethods="A")
  public void B()
  {
	  
  }
  @Test(priority=4)
  public void C()
  {
	  
  }
  @Test(priority=1)
  public void D()
  {
	  
  }
  
}
