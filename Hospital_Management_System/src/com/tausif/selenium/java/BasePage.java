package com.tausif.selenium.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BasePage {
	
	public WebDriver driver;
	public void browserLaunch(String browser,String url){
		
		if(browser.equalsIgnoreCase("chrome")){
			
			System.setProperty(
					"webdriver.chrome.driver",
					"G:\\Selenium All\\JARS Folders\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");

			driver = new ChromeDriver();
			
		}else if(browser.equalsIgnoreCase("IE")){
			
			System.setProperty("webdriver.ie.driver","G:\\Selenium All\\JARS Folders\\Selenium\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
			
			
			 driver = new InternetExplorerDriver();
		}
		
		driver.get(url);
		driver.manage().window().maximize();
	}
	

}
