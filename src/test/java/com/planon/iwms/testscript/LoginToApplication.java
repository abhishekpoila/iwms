package com.planon.iwms.testscript;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.companyname.projectname.pagelibrary.SignIn;
import com.planon.iwms.pagelibrary.Login_Page;
import com.planon.iwms.testbase.TestBase;
import com.relevantcodes.extentreports.LogStatus;

public class LoginToApplication extends TestBase{
	@BeforeClass
	public void setUP() throws IOException{
		init();
		// starting test
		test = extent.startTest("Login Test", "This test will verify login test");
		
		test.log(LogStatus.PASS, "Basic set up for test is done");
	}
	
	@Test
	public void testlogin() throws InterruptedException, IOException{
		try{
			test.log(LogStatus.PASS, "Login Test started");
			Login_Page loginpage = new Login_Page(driver);
			loginpage.loginToApplication();
			Thread.sleep(3000);
		}
		catch(Exception e){
		}
		extent.endTest(test);
		extent.flush();
	}
	
	@AfterClass
	public void quitBrowser(){
		closeBrowser();
	}

}
