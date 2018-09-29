package actionlibrary;

import org.openqa.selenium.support.PageFactory;

import commonlibrary.DriverConfiguration;
import commonlibrary.Reports;
import elementrepository.Amazon;
import elementrepository.FlipkartLogin;

public class AmazonLib {
	Amazon L = PageFactory.initElements(DriverConfiguration.driver, Amazon.class);
	
	public void signin(){
		try{
		L.getSignin().click();
		Reports.PassCase("clicing on signin","signin");
	}
		catch(Exception e){
			System.out.println("error occured");
		}
	}
	
	public void email(String Email){
		try{
		L.getEmail().sendKeys("9535312084");
		Reports.PassCase("printing email", "Eamil");
	}
		catch(Exception e){
			System.out.println("error occured");
		}
	}
	
	public void conti(){
		try{
		L.getConti().click();
		Reports.PassCase("Click on continue","continue");
	}
		catch(Exception e){
			System.out.println("error occured");
		}
	}
	public void password(String Password){
		try{
		L.getPassword().sendKeys("444599");
		Reports.PassCase("Printing password", "password");
	}
		catch(Exception e){
			System.out.println("password");
		}
	}
	public void submit(){
		try{
		L.getSubmit().click();
		Reports.PassCase("Clicking on submit", "submit");
		}
		catch(Exception e){
			System.out.println("error occured");
		
		}
	}
	

}
