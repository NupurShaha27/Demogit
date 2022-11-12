package Test_cases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Pages.Forgot_password_Page;
import utilities.Launch_browser;

public class Test_forgotPassword {

	WebDriver driver;

	@Test
	public void TestCaseforgotpasswordclcik() throws IOException, InterruptedException
	{
	Launch_browser ObjectLoginLAC=new Launch_browser();
    driver=ObjectLoginLAC.launchweb();
	
    //Forgot password link
    
    Forgot_password_Page link_click_object= new Forgot_password_Page(driver);
    link_click_object.forgotpasswordlink_click();
    link_click_object.inputuserID();
    link_click_object.btnclick();
    Thread.sleep(3000L);
    link_click_object.messagereceived();
    link_click_object.backloginclick();
    
    driver.close();
}
}
