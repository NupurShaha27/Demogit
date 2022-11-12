package Test_cases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Pages.UserID_Page;
import utilities.Launch_browser;

public class TestCases {

	WebDriver driver;
	
	@Test(dependsOnMethods = "TestCase2")
	
	//Login with username and password
	public void Testcase1() throws IOException, InterruptedException
	{
		//Launch_browser ObjectLaunchbrowser=new Launch_browser();
		//driver=ObjectLaunchbrowser.launchweb();
		//UserID_Page userobject= new UserID_Page(driver);
		//userobject.LoginWith_username();
		System.out.println("Print 1");
	}
	
	@Test
	public void TestCase2() throws IOException, InterruptedException
	{

		Launch_browser ObjectLaunchbrowser=new Launch_browser();
		driver=ObjectLaunchbrowser.launchweb();
		UserID_Page userobject= new UserID_Page(driver);
		userobject.LoginWith_username();
		System.out.println("Print2");
		System.out.println("Git check..");
		driver.close();
	}
}
