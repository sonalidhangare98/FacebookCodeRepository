package TestClasses;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import FBPomClasses.FBLoginPom;

public class FBLoginTestClass extends FBPojoClass {
	

	
	@Test
	public void runLoginTest() throws InterruptedException
	{
		driver.get("https://www.facebook.com/");
		
		FBLoginPom obj=new FBLoginPom(driver);
		
		obj.clickCreateAccount();
		Thread.sleep(3000);
		obj.setFirstName();
		obj.setLastName();
		obj.setEmail();
		obj.reSetEmail();
		obj.setPass();
		Thread.sleep(2000);
		obj.selectDay();
		obj.selectMonth();
		obj.selectYear();
		
		obj.clickGender();
		
		obj.selectPronoun();
		
		obj.clicksignUp();
	}

}
