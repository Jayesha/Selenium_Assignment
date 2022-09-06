package TestPages;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
import Util.Constant;

public class LoginTest extends TestBase
{

	public LoginTest() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void LoginTest() throws Exception
	{
		driver = Initialization();
		driver.manage().deleteAllCookies();
	
		driver.get(Constant.URL);
		
		LoginPage lp = new LoginPage(driver);
		Thread.sleep(5000);
		//lp.getgmail_link().click();
		//Thread.sleep(3000);
		lp.getsign_in().click();
		Thread.sleep(2000);
		//Enter Username
		lp.getusername().sendKeys(prop.getProperty("username"));
		Thread.sleep(3000);
		lp.getnext().click();
		Thread.sleep(3000);
		//Enter Password
		lp.getpassword().sendKeys(prop.getProperty("password"));
		Thread.sleep(3000);
		lp.getnext().click();
		Thread.sleep(5000);
		//Click onCompose
		lp.getcompose().click();
		Thread.sleep(2000);
		//Enter email id in To
		lp.getto().sendKeys(prop.getProperty("to"));
		Thread.sleep(2000);
		//Enter the Subject of email
		lp.getsubject().sendKeys(prop.getProperty("subject"));
		Thread.sleep(2000);
		//Enter the Body of the email
		lp.getbody().sendKeys(prop.getProperty("body"));
		Thread.sleep(4000);
		//Click on Send button
		lp.getsend().click();
		Thread.sleep(5000);
		//Click on sent folder to verify if email sent
		lp.getsent().click();
		Thread.sleep(3000);
		
	}

}
