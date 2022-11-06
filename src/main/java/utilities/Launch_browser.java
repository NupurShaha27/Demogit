package utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_browser {
	
	
	WebDriver driver;
	
	public WebDriver launchweb() throws IOException
	{
			ReadProperties readobj= new ReadProperties();
			System.out.println();
		
			System.setProperty("webdriver.chrome.driver", readobj.getproperties("ChromeEngine_Location"));
			WebDriver driver= new ChromeDriver();
			driver.get(readobj.getproperties("Browser_URL"));
			driver.manage().window().maximize();

			
			//driver.manage().timeouts().implicitlyWait(0, null)
			return driver;
			
			
	}
}
