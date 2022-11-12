package Test_cases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Pages.Signup_Page;
import utilities.Launch_browser;

public class TestCase_Signup {

	WebDriver driver;

	@Test
	public void signupflow() throws IOException
	{
		Launch_browser ObjectLoginLAC=new Launch_browser();
	    driver=ObjectLoginLAC.launchweb();
		
	    //Signup flow
	    Signup_Page signupflowobject= new  Signup_Page(driver);
	    signupflowobject.signupnavigate();
	    signupflowobject.INPUTFIELDSIGNUP();
	    signupflowobject.signuppassword();
	     System.out.println("Git check...");
	}	    
}
