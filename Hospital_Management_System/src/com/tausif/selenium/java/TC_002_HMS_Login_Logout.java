package com.tausif.selenium.java;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class TC_002_HMS_Login_Logout extends BasePage{
	
	public ATUTestRecorder recorder;
	
	@Test(description="this test is to verify login and logout in HMS")
	public void hmsLogin_Logout() throws ATUTestRecorderException{
		
		PageUI page = new PageUI(driver);
		page.hrmLogin();
		page.hmsLogout();
		recorder.stop();
		
		
	}
	
	@BeforeTest
	public void beforeTest() throws ATUTestRecorderException {
		recorder = new ATUTestRecorder("G:\\recording", "HMSLogin",false);
		recorder.start();
		browserLaunch("chrome","http://www.seleniumbymahesh.com/");
	}

}
