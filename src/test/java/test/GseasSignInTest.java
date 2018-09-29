package test;

import org.testng.annotations.BeforeClass;

import actionlibrary.GseasSignInLib;
import commonlibrary.DriverConfiguration;

public class GseasSignInTest {
	DriverConfiguration B = new DriverConfiguration();
	GseasSignInLib H;
	@BeforeClass
	public void BeforeTest(){
		B.openbrowser("chrome");
		H= new GseasSignInLib();
	}
		
	@org.testng.annotations.BeforeMethod
	public void BeforeMethod(){
		B.driver.get("https://www.gseas.com/#/landing");	
	}
	
	@org.testng.annotations.Test
	public void Test() throws Exception{
		 H.userid("Harshith11@abc");
		 H.password("12345678");
		 Thread.sleep(2000);
		 H.Login();
	} 
}


