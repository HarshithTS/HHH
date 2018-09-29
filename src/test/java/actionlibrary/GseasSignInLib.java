package actionlibrary;

import org.openqa.selenium.support.PageFactory;

import commonlibrary.DriverConfiguration;
import commonlibrary.Reports;
import elementrepository.GseasSignIn;

public class GseasSignInLib {
GseasSignIn G = PageFactory.initElements(DriverConfiguration.driver, GseasSignIn.class);
public void userid(String Userid){
	try{
	G.getUserid().sendKeys(Userid);
	Reports.PassCase("printing userid" , "user id");
}
	catch(Exception e){
		System.out.println("error occured");
	}
}
	public void password(String password){
		try{
		G.getPassword().sendKeys(password);
		Reports.PassCase("printing password", "password");
	}
		catch(Exception e){
			System.out.println("error occured");
		}
	}
	public void Login(){
		try{
		G.getLogin().click();
		Reports.PassCase("clicking on login" ,"Login");
	}
		catch(Exception e){
			System.out.println("error occured");
		}
	}
}
