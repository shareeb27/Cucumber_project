package com.nykaa_Step_Def;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;

import org.openqa.selenium.JavascriptExecutor;
import com.ConfigurationReader.File_Read_manager;
import com.ConfigurationReader.config_Reader;
import com.base.base_class;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom_Manager.PageobjectManager;

public class Step_definition extends base_class {
	
	PageobjectManager pom = new PageobjectManager(driver);
			
	
	@Given("^user Lanuch the application$")
	public void user_Lanuch_the_application() throws Throwable {
		config_Reader cr = new config_Reader();
		passurl(File_Read_manager.GetIntanceFR().GetIntanceCR().geturl());
	}

	@When("^user click the signup button$")
	public void user_click_the_signup_button()  {
		click(pom.getLogin().getSignup());
	}

	@When("^user Click The Signin button$")
	public void user_Click_The_Signin_button(){
	    click(pom.getLogin().getSignin());
	}

	@When("^user Enter The Phone Number in input Field$")
	public void user_Enter_The_Phone_Number_in_input_Field() throws Throwable {
		config_Reader cr = new config_Reader();
     	passinput(pom.getLogin().getRegister(), "8610765217");
	}

	@Then("^user Click The proceed button$")
	public void user_Click_The_proceed_button()  {
	 click(pom.getLogin().getProceed());
	}

	@When("^user Get and Pass The Otp$")
	public void user_Get_and_Pass_The_Otp()  {
		Scanner s= new Scanner(System.in);
		 System.out.println("OTP");
		 String otp = s.nextLine();
		 
		 passinput(pom.getLogin().getOtp(), otp);

	}

	@When("^user Click The Verify button$")
	public void user_Click_The_Verify_button(){
		click(pom.getLogin().getVerify());
		System.out.println("login successfuly");
	}
	
	@When("^user Move To Popups Element$")
	public void user_Move_To_Popups_Element() {
	actions("move",pom.getCtgry().getpopups());
	}

	@When("^user Click The Headphones Element$")
	public void user_Click_The_Headphones_Element() {
	    actions("click",pom.getCtgry().getheadset());
	}

	@Then("^Browser switch to Window Handling Method$")
	public void browser_switch_to_Window_Handling_Method(){
	    windowhandle("multiple");
	    JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2500)");
	}

	@When("^user Selects the Product Element$")
	public void user_Selects_the_Product_Element()  {
	   //click(pom.getCtgry().getboult());
	   actions("move",pom.getCtgry().getboult());
	   actions("click",pom.getCtgry().getboult());
	   System.out.println("click boult");
	}
	
	@Then("^Browser switch to Window Handling Methods$")
	public void browser_switch_to_Window_Handling_Methods() {
		windowhandle("multiple");
		
	}

	@Then("^user adds the Product to Add to Cart button$")
	public void user_adds_the_Product_to_Add_to_Cart_button()  {
	 click(pom.getCtgry().getAddcart());
	 System.out.println("product added to bag");
	}

	@When("^user Click The Bag$")
	public void user_Click_The_Bag()  {
    click(pom.getAdd2bag().getBag());
	System.out.println("opening bag");
	}
	
	
	@When("^user Switch to iFrame$")
	public void user_Switch_to_iFrame()  {
	   frames("webframe",null ,pom.getAdd2bag().getCartframe());
	}

	@When("^user Click to Proceed button$")
	public void user_Click_to_Proceed_button()  {
	    click(pom.getAdd2bag().getProceed());
	    System.out.println("proceed order");
	}

	@When("^user Add Email or New Address$")
	public void user_Add_Email_or_New_Address() throws InterruptedException {
	    click(pom.getAdd2bag().getAddAddress());
	}
	
	@When("^user Enter Pincode In The Feild$")
	public void user_Enter_Pincode_In_The_Feild() throws Throwable {
	passinput(pom.getAddress().getPincode(),File_Read_manager.GetIntanceFR().GetIntanceCR().getpincode());
		System.out.println("inserting PINCODE");
		
		Robot Pin = new Robot();
		Pin.keyPress(KeyEvent.VK_TAB);
		threadsleep(2000);
	}
	
	@When("^user Enter House Number In The Feild$")
	public void user_Enter_House_Number_In_The_Feild() throws Throwable {
		passinput(pom.getAddress().getHouseNo(),File_Read_manager.GetIntanceFR().GetIntanceCR().gethouseno());
		System.out.println("inserting house number");
	}
	
	@When("^user Enter AreaName In The feild$")
	public void user_Enter_AreaName_In_The_feild() throws Throwable {
	  passinput(pom.getAddress().getAreaname(),File_Read_manager.GetIntanceFR().GetIntanceCR().getarea());
	  System.out.println("inserting area name");
	}

	@When("^user Enter Name In The Feild$")
	public void user_Enter_Name_In_The_Feild() throws Throwable {
	    passinput(pom.getAddress().getName(),File_Read_manager.GetIntanceFR().GetIntanceCR().getname());
	    System.out.println("inserting NAME");
	}

	@When("^user Enter PhoneNumber In The Feild$")
	public void user_Enter_PhoneNumber_In_The_Feild() throws Throwable {
	    passinput(pom.getAddress().getPhonenumber(),File_Read_manager.GetIntanceFR().GetIntanceCR().getphonenumber());
	    System.out.println("inserting phone number");
	}
	
	
	@When("^user Click Ship to Address button$")
	public void user_Click_Ship_to_Address_button()  {
	    click(pom.getAddress().getShip2address());
	    System.out.println("click to ship Address");
	}

	@When("^user Click on Cash on Delivery$")
	public void user_Click_on_Cash_on_Delivery() {
	    click(pom.getPayment().getCashonDeleivery());
	    System.out.println("choose to cash on delivery");
	}

	@When("^user Place a Order$")
	public void user_Place_a_Order()  {
	    click(pom.getPayment().getPlaceOrder());
	    System.out.println("place the order");
	}
}