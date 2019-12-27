package com.tausif.selenium.java;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC_001_HMS_Login_Logout extends BasePage {
	
	@Test(description="this test is to verify login and logout in HMS")
	public void hmsLogin_Logout(){
		PageUI page = new PageUI(driver);
		page.hrmLogin();
		page.hmsLogout();
		
	}
	
	@BeforeTest
	public void beforeTest(){
		browserLaunch("chrome","http://www.seleniumbymahesh.com/");
	}

}
