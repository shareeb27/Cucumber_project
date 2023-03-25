package base_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class nykaLoginPom {
	public static WebDriver driver;
	
	@FindBy(xpath="//button[text()='Sign in']")
	private WebElement signup;
	
	@FindBy(xpath="//button[text()='Sign in with Mobile / Email']")
	private WebElement signin;
	
	@FindBy(xpath="//input[@name='emailMobile']")
	private WebElement register;
	
	@FindBy(xpath="//button[text()='proceed']")
	private WebElement proceed;
	
	@FindBy(xpath="//input[@type=\"number\"]")
	private WebElement otp;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	private WebElement verify;
	
	public WebElement getSignup() {
		return signup;
	}

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getRegister() {
		return register;
	}

	public WebElement getProceed() {
		return proceed;
	}

	public WebElement getOtp() {
		return otp;
	}

	public WebElement getVerify() {
		return verify;
	}

	
	
	
	public nykaLoginPom(WebDriver dri) {
			
		driver=dri;
		PageFactory.initElements(driver,this);
	}
	
	
	
	
	
}
