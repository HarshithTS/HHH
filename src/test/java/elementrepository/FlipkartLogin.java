package elementrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlipkartLogin {
	
	@FindBy(xpath="//input[@class='_2zrpKA']")
	private WebElement Mobno;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	private WebElement Login;

	public WebElement getMobno() {
		return Mobno;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return Login;
	}
	

}
