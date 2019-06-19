package DemoTestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo9 {
	WebDriver driver;
	//WebDriver driver1;

	@Parameters ("mybrowser")
	@BeforeTest
	public void launch(String mybrowser)
	{
	
	if (mybrowser.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ArokiyaJeniferL\\Desktop\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		
	}
	else if(mybrowser.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ArokiyaJeniferL\\Desktop\\Selenium\\chromedriver.exe");
		driver= new ChromeDriver();
	}

	}
	@Test
	public void test1() throws IOException, InterruptedException
	{
		System.out.println("At Test");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("C:\\Users\\ArokiyaJeniferL\\Desktop\\Selenium\\data\\Screen.png"));
		
	}
	@AfterTest
	public void xend()
	{
		
		driver.close();
	}


}
