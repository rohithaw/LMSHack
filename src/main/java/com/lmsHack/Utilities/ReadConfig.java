package com.lmsHack.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	
	
Properties property;
	
	public ReadConfig()
	{
		File src = new File("./ConfigFiles/Config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			property = new Properties();
			property.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}
	
	public String getApplicationURL()
	{
		String url=property.getProperty("BaseUrl");
		return url;
	}
	
	public String getRegisterURL()
	{
		String surl=property.getProperty("startUrl");
		return surl;
	}
	
	
	public String getUsername()
	{
	String username=property.getProperty("username");
	return username;
	}
	
	public String getPassword()
	{
	String password=property.getProperty("password");
	return password;
	}
	
	public String getChromePath()
	{
	String chromepath=property.getProperty("chromepath");
	return chromepath;
	}
	
	public String getFirefoxPath()
	{
	String firefoxpath=property.getProperty("firefoxpath");
	return firefoxpath;
	}
	

}
