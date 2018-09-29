package elementrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GseasSignIn {
	@FindBy(xpath="//input[@name='user_id']")
	private WebElement userid;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement login;

	public WebElement getUserid() {
		return userid;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	

}
