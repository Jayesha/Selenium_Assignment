package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;

import Util.TestUtil;

public class TestBase 
{
	public static Properties prop;
	public static WebDriver driver;
	
	public TestBase() throws Exception
	{
		try
		{
			prop = new Properties();
			FileInputStream ip = new FileInputStream("D:\\Selenium_Basic_Practise\\Assignment\\src\\main\\java\\Config\\config.properties");
			prop.load(ip);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public WebDriver Initialization()
	{
		WebDriver driver = null;
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Basic_Practise\\Assignment\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("Firefox"))
				{
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium_Basic_Practise\\Assignment\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
				}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT , TimeUnit.SECONDS);
		return driver;
	}
	
	@AfterSuite
	public void tearDown()
	{
		if(null != driver)
		{
			driver.close();
			driver.quit();
		}
		
	}

}
