package base_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class nykaaAdd2bag {
 public static WebDriver driver;
	
    @FindBy(xpath="//span[@class='cart-count']")
	private WebElement bag;
 
	@FindBy(xpath="//iframe[@class='css-acpm4k']")
	private WebElement cartframe;
	
	@FindBy(xpath="//span[text()='Proceed']")
	private WebElement proceed;
	
	@FindBy(xpath="//div[@class='css-1pan5g8 e1gecm6x0']")
	private WebElement addAddress;
	
	
	public WebElement getBag() {
		return bag;
	}

	public WebElement getCartframe() {
		return cartframe;
	}

	public WebElement getProceed() {
		return proceed;
	}

	public WebElement getAddAddress() {
		return addAddress;
	}

	
	public nykaaAdd2bag(WebDriver dri3) {
	
		driver=dri3;
		PageFactory.initElements(driver,this);
		
		}
	
	
}
