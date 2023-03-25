package pom_Manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import base_pom.nykaLoginPom;
import base_pom.nykaaAdd2bag;
import base_pom.nykaaAddresspom;
import base_pom.nykaaCatagoryPom;
import base_pom.nykaaplaceOrderPom;

public class PageobjectManager {

	public static WebDriver driver;
		
	private nykaLoginPom login;
    
	private nykaaCatagoryPom ctgry;
	
	private nykaaAddresspom address;
	 
	private nykaaAdd2bag add2bag;
	
	private nykaaplaceOrderPom payment;
	
	
	public nykaLoginPom getLogin() {
		login = new nykaLoginPom(driver);
		return login;
	}



	public nykaaCatagoryPom getCtgry() {
		ctgry = new nykaaCatagoryPom(driver);
		return ctgry;
	}



	public nykaaAddresspom getAddress() {
		address = new nykaaAddresspom(driver);
		return address;
	}



	public nykaaAdd2bag getAdd2bag() {
		add2bag = new nykaaAdd2bag(driver);
		return add2bag;
	}



	public nykaaplaceOrderPom getPayment() {
		payment = new nykaaplaceOrderPom(driver);
		return payment;
	}



	
	
	
	public PageobjectManager(WebDriver drive) {
		  
		driver=drive;
   PageFactory.initElements(driver, drive);		
		}
	
}
