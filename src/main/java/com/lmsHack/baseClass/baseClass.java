package com.lmsHack.baseClass;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.lmsHack.Utilities.ReadConfig;

public class baseClass {
	
	
ReadConfig readconfig=new ReadConfig();
	
	public String baseURL=readconfig.getApplicationURL();
	//public String StartURL=readconfig.getRegisterURL();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
    public static WebDriver driver;
    public static Logger logger;
    
    @Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{			
    	logger = Logger.getLogger("LMSHack");//added logger
		PropertyConfigurator.configure("log4j.properties");//location of property file
		
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
	    	driver=new ChromeDriver();
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxPath());
			driver = new FirefoxDriver();
		}
		
		logger.setLevel(Level.DEBUG);
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(baseURL);
	}
    
    
    @AfterClass
    public void teardown()
    {
    	driver.quit();
    }
    
	

}
