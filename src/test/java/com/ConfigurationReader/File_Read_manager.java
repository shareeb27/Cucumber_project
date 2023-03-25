package com.ConfigurationReader;

import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputFilter.Config;

public class File_Read_manager {

	private File_Read_manager() {
		
	}

	public static File_Read_manager GetIntanceFR() {
		
	File_Read_manager fr = new File_Read_manager();
	return fr;
	
	}
	
	public static config_Reader GetIntanceCR() throws IOException {
		config_Reader cr = new config_Reader();
		return cr;
		
		
	}
	
	
	
	
	
}
