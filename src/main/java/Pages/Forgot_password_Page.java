package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Forgot_password_Page {

	WebDriver driver;
	
	public Forgot_password_Page(WebDriver driver) 
	{
		this.driver=driver;	
		
	}
	
	//forgot password link click
	By forgotpass_link= By.id("forgot_div");
	public void forgotpasswordlink_click()
	{
		driver.findElement(forgotpass_link).click();
	}

	//input userid
	By enteruserId= By.id("forgot_user_id");
	public void inputuserID()
	{
		driver.findElement(enteruserId).sendKeys("Test333@");
	}

	// submit click
	By btnsubmitclick = By.id("forget_password");
	public void btnclick()
	{
		driver.findElement(btnsubmitclick).click();
	}

	//return message
	By returnmessgae=By.xpath("//span[@class='forgotPassMsg conf_sms text-success']");
	public void messagereceived()
	{
		String message=driver.findElement(returnmessgae).getText();
		System.out.println(message);
	}
}
