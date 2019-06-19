package DemoTestNG;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo4 {
	WebDriver driver;
	
	@Test(priority=1)
	public void launch()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ArokiyaJeniferL\\Desktop\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();  
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Jeni";
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
	}

	@Test(dependsOnMethods ={"launch"},alwaysRun=true,priority=2)
	public void testcase() throws InterruptedException
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click(); 
		Thread.sleep(3000);
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
		
	}
	
	@Test(dependsOnMethods={"testcase"},alwaysRun=true,priority=3)
	public void xend()
	{
		driver.close();
	}
}
