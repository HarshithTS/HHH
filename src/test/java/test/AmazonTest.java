package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import actionlibrary.AmazonLib;
import commonlibrary.DriverConfiguration;

public class AmazonTest {
	DriverConfiguration A =new DriverConfiguration();
	AmazonLib H;
	
	@BeforeClass
	public void BeforeTest(){
		A.openbrowser("chrome");
		H= new AmazonLib();
	}
	@BeforeMethod
	public void BeforeMethod(){
		A.driver.get("https://www.amazon.in/");
		
	}
	@org.testng.annotations.Test
	public void Test(){
		H.signin();
		H.email("9535312084");
		H.conti();
		H.password("444599");
		H.submit();
	}
	

}
