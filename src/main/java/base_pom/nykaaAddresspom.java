package base_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class nykaaAddresspom {

	public static WebDriver driver;
	
//	@FindBy(xpath="//textarea[@placeholder=\"Road Name/ Area /Colony\"]")
//  private WebElement state;
//textarea[@class=\"input-element input-area \"]
	
	
	@FindBy(xpath="//input[@placeholder='Pincode']")
	private WebElement pincode;
	
	@FindBy(xpath="//input[@placeholder=\"House/ Flat/ Office No.\"]")
	private WebElement houseNo;

	@FindBy(xpath="//textarea[@placeholder=\"Road Name/ Area /Colony\"]")
	private WebElement areaname;
	
	@FindBy(xpath="//input[@placeholder=\"Name\"]")
	private WebElement name;
	
	
	@FindBy(xpath="//input[@placeholder=\"Phone\"]")
	private WebElement phonenumber;
	
	
	
	
	@FindBy(xpath="//button[text()='Ship to this address']")
	private WebElement ship2address;
	
	

	public WebElement getPincode() {
		return pincode;
	}
	
	public WebElement getHouseNo() {
		return houseNo;
	}

//	public WebElement getState() {
//		return state;
//	}

	public WebElement getAreaname() {
		return areaname;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getPhonenumber() {
		return phonenumber;
	}

	public WebElement getShip2address() {
		return ship2address;
	}

	public nykaaAddresspom(WebDriver dri4) {
		driver=dri4;
		
		PageFactory.initElements(driver,this);
	}
	
}
