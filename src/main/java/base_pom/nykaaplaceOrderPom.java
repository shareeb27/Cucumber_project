package base_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class nykaaplaceOrderPom {

	public static WebDriver driver;
	
	@FindBy(xpath="//p[text()='Cash on delivery']")
    private WebElement cashonDeleivery;
	
	
	@FindBy(xpath="//button[text()='Place order']")
	private WebElement placeOrder;
	
	
	

	public WebElement getCashonDeleivery() {
		return cashonDeleivery;
	}

	public WebElement getPlaceOrder() {
		return placeOrder;
	}

	
	
	public nykaaplaceOrderPom(WebDriver dri5) {
		
		driver=dri5;
		
		PageFactory.initElements(driver,this);
		
	}
	
}
