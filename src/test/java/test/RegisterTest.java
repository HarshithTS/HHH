package test;

import java.lang.reflect.Method;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.relevantcodes.extentreports.LogStatus;

import actionlibrary.RegisterLib;
import commonlibrary.DriverConfiguration;
import commonlibrary.Reports;

public class RegisterTest {
	DriverConfiguration B =new DriverConfiguration();
	RegisterLib H;
	@BeforeClass
	public void BeforeTest()
	{
		//driver.get("http://demo.automationtesting.in/Register.html");
		
		B.openbrowser("chrome");
		H =new RegisterLib();
	}
	@org.testng.annotations.BeforeMethod
	public void BeforeMethod(Method m){
		B.driver.get("http://demo.automationtesting.in/Register.html");
		Reports.report1.startTest(m.getName());
	}
    @org.testng.annotations.Test
    public void Test() throws Exception
    {
    	H.enterfirstname("Harshhh!");
    	H.enterLastname("T S");
    	H.Address("BTM");
    	H.Email("xyzharsss@gmail.com");
    	H.Phone("9980910634");
    	H.Sex();
    	H.Hobbies();
    	H.languagetab();
    	H.Languages();
    	H.Elanguagetab();
    	Thread.sleep(5000);
    	H.Skills();
    	H.Skillss();
    	H.Countrytab();
    	H.Country();
    	H.SelCountrytab();
    	H.Selcountry();
    	H.Yeartab();
    	H.Year();
    	H.Monthtab();
    	H.Month();
    	H.Daytab();
    	H.Day();
    	H.Password("Harshithts1");
    	H.ConfirmPassword("Harshithts1");
        H.Submit();
    }
    
    @AfterClass
    public void openTestReport(){
    	Reports.logger.log(LogStatus.INFO,"Test END");
    	Reports.report1.endTest(Reports.logger);
    	Reports.report1.flush();//flush method commits the report and logger object things to the file
    	DriverConfiguration.driver.get(Reports.ReportLocation);
    	
   
    	
    }

}

