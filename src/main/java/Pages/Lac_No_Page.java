package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Lac_No_Page {

	WebDriver driver;
	public Lac_No_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void LacNoTabClick()
	{
		By lac=By.id("lac_tab");
		driver.findElement(lac).click();		
	}
	
	public void InputLACNo()
	{
		By lacno=By.id("account_no");
		driver.findElement(lacno).sendKeys("629293120");
		
		By dob= By.id("dob");
		driver.findElement(dob).sendKeys("29-03-1987");
	}
	
	public void submitbtn_click()
	{
		By btnclick=By.xpath("//button[@type='submit']");
		driver.findElement(btnclick).click();
		
	}
}
