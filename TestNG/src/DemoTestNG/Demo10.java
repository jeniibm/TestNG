package DemoTestNG;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Demo10 {
	public WebDriver driver;
	
	@Test
	public void testcase1() throws IOException
	{
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.WIN10);
		driver = new RemoteWebDriver(new URL("http://192.168.43.138:4444/wd/hub"),capabilities);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String title = driver.getTitle();
		System.out.println(title);
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("C:\\Users\\ArokiyaJeniferL\\Desktop\\Selenium\\data\\Screen2.png"));
		
	}

}
