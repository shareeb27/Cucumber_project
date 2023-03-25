package com.ConfigurationReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class config_Reader {

	public static Properties p;
	
	public config_Reader() throws IOException {
	
		File f = new File("C:\\Cucumber_project\\propertiesFile\\config.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}
	
	public String geturl() {
	   String url = p.getProperty("url");
	      return url;
	}
	
	public String getmobile() {
		String Mobile = p.getProperty("mobile");
	      return Mobile;
	}

	public String getpincode() {
		String pincode =p.getProperty("pincode");
		return pincode;
	}
	public String gethouseno() {
		String houseno =p.getProperty("Houseno");
		return houseno;
	}

	public String getroad() {
		String road =p.getProperty("Road");
		return road;
	}

	public String getname() {
		String name =p.getProperty("Name");
		return name;
	}

	public String getphonenumber() {
		String phonenumber =p.getProperty("phonenumber");
		return phonenumber;
	}

	public String getstate() {
		String state = p.getProperty("state");
				return state;
	}

	
	public String getarea() {
		String area = p.getProperty("area");
		return area;
	}

}









