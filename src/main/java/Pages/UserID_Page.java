package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UserID_Page {

	WebDriver driver;
	
	String uname="Test111@";
	String Pass="Hdfc@2023";

	By usname= By.id("user_id");
	public  UserID_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void LoginWith_username() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(usname).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(Pass);
		driver.findElement(By.xpath("//div[@class='col-md-12 text-center mob-mb']//button[@type='submit']")).click();
		
	}
}
