package elementrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Amazon {
@FindBy(xpath="//span[contains (text(),'Hello. Sign in')]")
private WebElement signin;

@FindBy(xpath="//input[@type='email']")
private WebElement email;

@FindBy(xpath="//input[@class='a-button-input']")
private WebElement conti;

@FindBy(xpath="//input[@type='password']")
private WebElement password;

@FindBy(xpath="//input[@id='signInSubmit']")
private WebElement submit;

public WebElement getSignin() {
	return signin;
}

public WebElement getEmail() {
	return email;
}

public WebElement getConti() {
	return conti;
}

public WebElement getPassword() {
	return password;
}

public WebElement getSubmit() {
	return submit;
}



}


