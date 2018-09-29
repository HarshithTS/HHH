package test;

import org.testng.annotations.BeforeClass;

import actionlibrary.FlipkartLoginLib;
import commonlibrary.DriverConfiguration;

public class FlipkartLoginTest {
	
	DriverConfiguration K =new DriverConfiguration();
	FlipkartLoginLib Z;

	
	@BeforeClass
	public void BeforeTest(){
	K.openbrowser("chrome");
	Z = new FlipkartLoginLib();	
	}
	
	@org.testng.annotations.BeforeMethod
	public void BeforeMethod(){
		K.driver.get("https://www.flipkart.com/");
	}
	
	@org.testng.annotations.Test
	public void Test() throws Exception{
		Z.Mobno("9535312084");
		Z.Password("444599");
		Thread.sleep(2000);
		Z.Login();
	}
}
