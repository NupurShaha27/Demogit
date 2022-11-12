package Test_cases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Pages.Lac_No_Page;
import utilities.Launch_browser;

public class TestCase_Login_LacNo {
	
	WebDriver driver ;
	
	@Test
	public void Login_LAC() throws IOException
	{
	
		Launch_browser ObjectLoginLAC=new Launch_browser();
	    driver=ObjectLoginLAC.launchweb();
	//Login though loan account number
	    Lac_No_Page objectLACNO= new Lac_No_Page(driver);
	
	    objectLACNO.LacNoTabClick();
	    objectLACNO.InputLACNo();
	    objectLACNO.submitbtn_click();
	    driver.close();
	    System.out.println("GIT check..");
	    System.out.println("Check branch working..");
	}

}
