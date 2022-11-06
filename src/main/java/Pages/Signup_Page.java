package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Signup_Page {

	
	WebDriver driver;
	public Signup_Page(WebDriver driver)
			{
				this.driver=driver;
			}
	
	By signupLink=By.xpath("(//p[@class='p_tag mt-4']/a[@class='login_signup_up'])[2]");
	public void signupnavigate()
	{
		driver.findElement(signupLink).click();
	}

	By inputname=By.id("full_name");
	By dob=By.id("dob");
    By emailid=By.id("email_id");
    By mobno=By.id("mobile_no");
    By nextbtn=By.xpath("//button[@type='submit']");
    public void INPUTFIELDSIGNUP()
    {
    	driver.findElement(inputname).sendKeys("Nupur");
    	driver.findElement(dob).sendKeys("11-11-1990");
    	driver.findElement(emailid).sendKeys("nupur.shah@hdfcsupport.co.in");
    	driver.findElement(mobno).sendKeys("1234567890");
    	driver.findElement(nextbtn).click();
    }
    
    
    //password page
    By singuppass=By.id("signup_password");
    By confirmsignuppass=By.id("pass_confirm");
    By userid= By.id("signup_user_id");
   /// By cpatcha=By.className("recaptcha-checkbox-border");
    By submitpass=By.xpath("//button[@type='submit']");
   public void signuppassword()
   {
	   driver.findElement(singuppass).sendKeys("Hdfc@2022");
	   driver.findElement(confirmsignuppass).sendKeys("Hdfc@2022");
	   driver.findElement(userid).sendKeys("Test999_");
	  // driver.findElement(cpatcha).click();
	   
	   driver.manage().timeouts().implicitlyWait(5000L, TimeUnit.SECONDS);
	   driver.findElement(submitpass).click();
   }
    
}

