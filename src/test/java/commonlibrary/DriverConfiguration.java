package commonlibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverConfiguration {
	public static WebDriver driver;
	public void openbrowser(String browserName)
	{
		
	switch(browserName)
	{
	case "chrome":System.setProperty("webdriver.chrome.driver", "E:\\credit\\chromedriver.exe");
	 ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-infobars");
	
	driver= new ChromeDriver(options);
	driver.manage().window().maximize();
	break;
	}
	Reports.intialiseconfig();
		
	}

}
