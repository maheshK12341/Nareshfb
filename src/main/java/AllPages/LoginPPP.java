package AllPages;

import org.openqa.selenium.By;

import BasePP.BaseCCC;

public class LoginPPP extends BaseCCC
{

	static By Username= By.id("email");
	static By password=By.id("pass");
	static By Loginbutton=By.name("login");
	
	
	public static void Enter_Email(String EmailId)
	{
		driver.findElement(Username).sendKeys(EmailId);
		
	}
	public static void Enter_password(String passwordid)
	{
		driver.findElement(password).sendKeys(passwordid);
	}
	
	public static void LoginIn()
	{
		driver.findElement(Loginbutton).click();
	}
	
}
