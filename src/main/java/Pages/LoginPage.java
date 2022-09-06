package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage 
{
	public WebDriver driver;
	public WebDriverWait wait;
	
	By gmail_link = By.xpath("//a[contains(text(), 'Gmail')]");
	By sign_in = By.xpath("//a[contains(text(), 'Sign in')]");
	By username = By.xpath("//input[@type = 'email']");
	By password = By.xpath("//input[@type='password']");
	By next = By.xpath("//span[contains(text(), 'Next')]");
	By status = By.xpath("//li[contains (text(), 'World Capitals')]");
	By compose = By.xpath("//div[@class='T-I T-I-KE L3']");
	By to = By.xpath("//textarea[@name='to']");
	By subject = By.xpath("//input[@name='subjectbox']");
	By body = By.xpath("//div[@class='Am Al editable LW-avf tS-tW']");
	By send = By.xpath("//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']");
	By sent = By.xpath("//a[contains (text(), 'Sent')]");
	
	//Initializing the page objects
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public WebElement getusername()
	{
		return driver.findElement(username);
	}
	public WebElement getpassword()
	{
		return driver.findElement(password);
	}
	public WebElement getgmail_link()
	{
		return driver.findElement(gmail_link);
	}
	public WebElement getsign_in()
	{
		return driver.findElement(sign_in);
	}
	public WebElement getnext()
	{
		return driver.findElement(next);
	}
	public WebElement getcompose()
	{
		return driver.findElement(compose);
	}
	public WebElement getsubject()
	{
		return driver.findElement(subject);
	}
	public WebElement getto()
	{
		return driver.findElement(to);
	}
	public WebElement getbody()
	{
		return driver.findElement(body);
	}
	public WebElement getsend()
	{
		return driver.findElement(send);
	}
	public WebElement getsent()
	{
		return driver.findElement(sent);
	}
	
}
