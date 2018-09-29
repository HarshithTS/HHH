package elementrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register {
	
	@FindBy(xpath="//input[@placeholder ='First Name']")
private WebElement firstname;

	@FindBy(xpath="//input[@placeholder='Last Name']")
	private WebElement Lastname;
	
	@FindBy(xpath="//textarea[@rows='3']")
	private WebElement Address;
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@type='tel']")
	private WebElement phone;
	
	@FindBy(xpath="//input[@value='Male']")
	private WebElement sex;
	
	@FindBy(xpath="//input[@value='Cricket']")
	private WebElement hobbies;
	
	@FindBy(xpath="//div[@id='msdd']")
	private WebElement languagetab;
	
	@FindBy(xpath="//a[contains(text(),'English')]")
	private WebElement languages;
	
	@FindBy(xpath="//label[contains(text(),'Languages')]")
	private WebElement elanguagetab;

	@FindBy(xpath="//select[@ng-model='Skill']")
	private WebElement skills;
	
	@FindBy(xpath="//option[contains (text(),'Adobe Photoshop')]")
	private WebElement skillss;


	@FindBy(xpath="//select[@id='countries']")
	private WebElement countrytab;  
	@FindBy(xpath="//option[contains (text(),'India')]")
	private WebElement country;
	
	@FindBy(xpath="//span[@role='combobox']")
	private WebElement selcountrytab;
	
	@FindBy(xpath="//li[contains(text(),'Hong Kong')]")
	private WebElement selcountry;
	

	@FindBy(xpath="//select[@placeholder='Year']") 
	private WebElement yeartab;
	@FindBy(xpath="//option[contains (text(),'1994')]")
	private WebElement year;
	
	@FindBy(xpath="//select[@placeholder='Month']")
	private WebElement monthtab;
	@FindBy(xpath="//option[contains (text(),'November')]")
	private WebElement month;
	
	@FindBy(xpath="//select[@placeholder='Day']")
	private WebElement daytab;
	@FindBy(xpath="//option[@value='31']")
	private WebElement day;
	
	@FindBy(xpath="//input[@ng-model='Password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='secondpassword']")
	private WebElement confirmpassword;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit;

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return Lastname;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getSex() {
		return sex;
	}

	public WebElement getHobbies() {
		return hobbies;
	}

	public WebElement getLanguagetab() {
		return languagetab;
	}

	public WebElement getLanguages() {
		return languages;
	}
	public WebElement getElanguagetab() {
		return elanguagetab;
	}
	
	public WebElement getSkills() {
		return skills;
	}

	public WebElement getSkillss() {
		return skillss;
	}
	

	public WebElement getCountrytab() {
		return countrytab;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getSelcountrytab() {
		return selcountrytab;
	}

	public WebElement getSelcountry() {
		return selcountry;
	}
	

	
	

	public WebElement getYeartab() {
		return yeartab;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getMonthtab() {
		return monthtab;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getDaytab() {
		return daytab;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmpassword() {
		return confirmpassword;
	}

	public WebElement getSubmit() {
		return submit;
	}
}
/* 
WebElement a = driver.findElement(By.xpath(" //input[@placeholder ='First Name']"));
				a.sendKeys("Harshith");
		WebElement	b = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		        b.sendKeys("T S");
		WebElement c = driver.findElement(By.xpath("//textarea[@rows='3']")) ;
		        c.sendKeys("BTM LAYOUT");
		WebElement d = driver.findElement(By.xpath("//input[@type='email']"));      
		           d.sendKeys("harshith2623@gmail.com");
		WebElement e = driver.findElement(By.xpath("//input[@type='tel']"));
		           e.sendKeys("9535312084");
		WebElement f=driver.findElement(By.xpath("//input[@value='Male']"));
		           f.click();
		WebElement g =driver.findElement(By.xpath("//input[@value='Cricket']"));
		           g.click();
		           //Runtime.getRuntime().exec("taskkill /IM chromedriver.exe /f");
		WebElement hh = driver.findElement(By.xpath("//div[@id='msdd']"));
		        hh.click();
		WebElement ii = driver.findElement(By.xpath("//a[contains(text(),'Bulgarian')]"));
		       ii.click();
		        
		           Select drpSkills = new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
			   	drpSkills.selectByValue("Java");
			   	Select drpCountry = new Select(driver.findElement(By.xpath("//select[@id='countries']")));
			   	drpCountry.selectByValue("India");
			  
			   WebElement country2= driver.findElement(By.xpath("//span[@role='combobox']"));
		        country2.click();
		        WebElement countryn2 =driver.findElement(By.xpath("//li[contains(text(),'Hong Kong')]"));
		        countryn2.click();
			  	Select drpyr = new Select(driver.findElement(By.xpath("//select[@placeholder='Year']")));
			   	drpyr.selectByValue("1994");
			   	Select drpmonth = new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
			   	drpmonth.selectByValue("November");
			   	Select drpday = new Select(driver.findElement(By.xpath("//select[@placeholder='Day']")));
			   	drpday.selectByValue("23");
			   	WebElement i = driver.findElement(By.xpath("//input[@ng-model='Password']"));
			   	           i.sendKeys("Harshithts1");
			   WebElement j =driver.findElement(By.xpath("//input[@id='secondpassword']")) ;
			   	           j.sendKeys("Harshithts1");
			   WebElement k = driver.findElement(By.xpath("//button[@type='submit']"));	 
			              k.click();
*/