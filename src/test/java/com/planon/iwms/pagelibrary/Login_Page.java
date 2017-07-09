package com.planon.iwms.pagelibrary;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.planon.iwms.pagelibrary.Login_Page;
import com.planon.iwms.testbase.TestBase;
import com.relevantcodes.extentreports.LogStatus;

public class Login_Page extends TestBase{
	WebDriver driver;
	static Logger log = Logger.getLogger(Login_Page.class.getName());
	
	   By usr = By.id("j_username");
	   By pwd = By.id("j_password");
	   By sbt = By.xpath("//*[@id='loginForm']/div[4]/input");
	   
	  

		public Login_Page(WebDriver driver){
			this.driver = driver;
		}
		public void clickonSignIn(){
			log.info("clicking on sign in link");
			
			try {
				driver.findElement(sbt).click();
				test.log(LogStatus.PASS, "Clicking on sing in Link");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				test.log(LogStatus.FAIL,"Clicking on sing in Link");
			}
		}
		public void enterusername(String usrname){
			log.info("entering username to login");
			driver.findElement(usr).sendKeys(usrname);
		}
		public void enterpassword(String psword){
			log.info("entering password to login");
			driver.findElement(pwd).sendKeys(psword);
		}
		public void loginToApplication(){
			enterusername("supervisor");
			enterpassword("pADLndqbo");
			clickonSignIn();		}
}
