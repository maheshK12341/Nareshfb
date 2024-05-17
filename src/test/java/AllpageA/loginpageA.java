package AllpageA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BasePA.BaseCA;


public class loginpageA extends BaseCA

{
	public static By EmailInput=By.xpath("//input[@name='email']");
public static By Passid=By.xpath(" //input[@id='pass']");

public static By loginbutton=By.xpath("//button[@name='login']");

public static void Enter_emaild(String username)
{
	driver.findElement(EmailInput).sendKeys(username);

}

public static void Enter_password(String password)
{
	driver.findElement(Passid).sendKeys(password);
	
}
public static void login_submit()
{
	driver.findElement(loginbutton).click();
	}
}
