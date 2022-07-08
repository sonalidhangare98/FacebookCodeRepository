package TestClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class FBPojoClass {
	
	//public String baseUrl="https://www.facebook.com";
	public static WebDriver driver;
	
	@BeforeClass
	public void OpenChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver","E:\\DriversFolder\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
	}

}
