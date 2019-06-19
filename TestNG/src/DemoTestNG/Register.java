package DemoTestNG;

import java.awt.AWTException;
//import java.awt.Robot;
//import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Register {
	WebDriver driver;
	
  @Test(priority=1)
  public void A() throws InterruptedException 
  {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\ArokiyaJeniferL\\Desktop\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://retail.upskills.in/");
		driver.manage().window().maximize(); 
		Actions act = new Actions(driver);
		WebElement link = driver.findElement(By.xpath("//a[@href='javascript:;']"));
		//WebElement link1 = ;
		act.moveToElement(link).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='http://retail.upskills.in/earrings']")).click();
		Thread.sleep(3000);
  }
@Test(priority=2)
  public void ShoppingCart() throws InterruptedException
	{
	driver.findElement(By.xpath("//a[@href='http://retail.upskills.in/earrings/integer-vitae-iaculis-massaa']")).sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
	Thread.sleep(3000);
	ArrayList<String> tabs = new ArrayList(driver.getWindowHandles());
	
	//System.out.println("No of Tabs = " + tabs.size());
	Thread.sleep(2000);
	driver.switchTo().window(tabs.get(1));
	Thread.sleep(5000);
	//System.out.println(driver.getTitle());
	driver.findElement(By.id("button-cart")).click();
	Thread.sleep(3000);
	Actions act1 = new Actions(driver);
	WebElement link1 = driver.findElement(By.xpath("//*[@id='cart']/ul/li/a"));
	Thread.sleep(5000);
	act1.moveToElement(link1).build().perform();
	//mouseover.perform();
	Thread.sleep(3000);
	//String msg = "Integer vitae iaculis massa";
	WebElement link2 = driver.findElement(By.xpath("//*[@class='content']/h3"));
	
	System.out.println(link2.getText());
	
	
	}
}

