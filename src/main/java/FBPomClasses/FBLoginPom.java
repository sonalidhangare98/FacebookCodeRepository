package FBPomClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FBLoginPom {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[@data-testid='open-registration-form-button']")
	private WebElement CreateAccount;
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement FirstName;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement LastName;
	
	@FindBy(xpath="//input[@name='reg_email__']")
	private WebElement Email;
	
	@FindBy(xpath="//input[@name='reg_email_confirmation__']")
	private WebElement reSetEmail;
	
	@FindBy(xpath="//input[@name='reg_passwd__']")
	private WebElement Pass;
	
	@FindBy(xpath="//select[@id='day']")
	private WebElement Day;
	
	@FindBy(xpath="//select[@id='month']")
	private WebElement Month;
	

	@FindBy(xpath="//select[@id='year']")
	private WebElement Year;
	
	@FindBy(xpath="//label[text()='Custom']")
	private WebElement Gender;
	
	@FindBy(xpath="//select[@name='preferred_pronoun']")
	private WebElement selectPronoun;
	
	@FindBy(xpath="//button[@name='websubmit']")
	private WebElement signUp;
	
	public FBLoginPom(WebDriver d)
	{
		driver=d;
		
		PageFactory.initElements(d,this);
	}
	
	public void clickCreateAccount()
	{
		CreateAccount.click();
	}
	
	public void setFirstName()
	{
		FirstName.sendKeys("Pooja");
	}
	
	public void setLastName()
	{
		LastName.sendKeys("Gopal");
	}
	
	public void setEmail()
	{
		Email.sendKeys("sonalidhangare98@gmail.com");
	}
	
	public void reSetEmail()
	{
		reSetEmail.sendKeys("sonalidhangare98@gmail.com");
	}
	
	public void setPass()
	{
		Pass.sendKeys("gopal8877");
	}
	
	public void selectDay()
	{
		Select s=new Select(Day);
		
		s.selectByIndex(9);
	}
	
	public void selectMonth()
	{
		Select s=new Select(Month);
		
		s.selectByValue("5");
	}
	
	public void selectYear()
	{
		Select s=new Select(Year);
		
		s.selectByVisibleText("1996");
	}
	
	public void clickGender()
	{
		Gender.click();
	}
	
	public void selectPronoun()
	{
		Select s=new Select(selectPronoun);
		
		s.selectByIndex(2);
	}
	
	public void clicksignUp()
	{
		signUp.click();
	}

}
