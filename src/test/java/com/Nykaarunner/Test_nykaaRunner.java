package com.Nykaarunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.base.base_class;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Cucumber_project\\src\\test\\java\\com\\feature" ,glue = "com.nykaa_Step_Def")
public class Test_nykaaRunner  {


	public static WebDriver driver;
	
	@BeforeClass
	public static void setup() {
	  driver = base_class.browser_launch("chrome");
	  base_class.iwait(3000);
	  base_class.maximize();
	}

	@AfterClass
	public static void endprocess() {
		//driver.close();
		
	}
	
	
}
