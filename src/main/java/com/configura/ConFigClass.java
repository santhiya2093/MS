package com.configura;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConFigClass {
	
	public static Properties pro;
	
	public ConFigClass() throws IOException
	{
	File f = new File ("C:\\Users\\Admin\\eclipse-workspace\\LavenderProject\\Property File\\Configuration.properties");
	
	FileInputStream fis = new FileInputStream(f);
	
	 pro =new Properties();
	
	pro.load(fis);
	
	}
	
	public String getUrl() {
	     String url = pro.getProperty("url");
		return url ;
	}
	public String getUsername() {
		String username = pro.getProperty("username");
		return username;
	}
	public String getPassword() {
		String password = pro.getProperty("password");
		return password;
	}
	

}
