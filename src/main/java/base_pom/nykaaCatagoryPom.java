package base_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class nykaaCatagoryPom {
	public static WebDriver driver;
	
		@FindBy(xpath="//a[text()='Pop Ups']")
		private WebElement popups;
		
		@FindBy(xpath="//a[text()='Headphones  ']")
		private WebElement  headset;

		@FindBy(xpath = "//img[@alt=\"Boult Audio AirBass GearPods -Black\"]")
		private WebElement boult;
		
		@FindBy(xpath= "(//button[@class=' css-1qvy369'])[1]")
		private WebElement addcart;

		public WebElement getpopups() {
			return popups;
		}

		public WebElement getheadset() {
			return  headset;
		}

		public WebElement getboult() {
			return boult;
		}

		public WebElement getAddcart() {
			return addcart;
		}
	
	    public nykaaCatagoryPom(WebDriver dri) {
		       driver = dri;
		PageFactory.initElements(driver, this);
		}

}