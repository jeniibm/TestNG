package DemoTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo3 {
	
	WebDriver driver;
	
	@BeforeTest
	public void BT()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ArokiyaJeniferL\\Desktop\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("www://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void Testcase() throws InterruptedException
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click(); 
		Thread.sleep(3000);
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
	}
	
	@AfterTest
	public void AT()
	{
	driver.close();	
	}

}
