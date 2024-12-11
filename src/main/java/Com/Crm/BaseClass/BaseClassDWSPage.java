package Com.Crm.BaseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Com.Crm.Pom.DWSLogin;
import Com.Crm.Pom.DWSLogout;
import Com.Crm.fileutility.ReadPropertiesDWS;

public class BaseClassDWSPage {
public static WebDriver driver;
public static String Expected_Result="https://demowebshop.tricentis.com/";
@BeforeSuite
public void beforeSuite()
{
	System.out.println("Before Suite");
}
@BeforeTest
public void beforeTest() 
{
	System.out.println("Before Test");
}
@BeforeClass
public static void preCondition() throws IOException 
{
	String browser=ReadPropertiesDWS.property("browser");
	String url=ReadPropertiesDWS.property("url");
if(browser.equalsIgnoreCase("chrome")) 
{
driver=new ChromeDriver();	
}	
else if(browser.equalsIgnoreCase("firefox"))
{
driver=new FirefoxDriver();	
}
else if(browser.equalsIgnoreCase("edge"))
{
driver=new EdgeDriver();	
}
else 
{
driver=new ChromeDriver();	
}

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.get(url);
}
@BeforeMethod
public void login() throws IOException 
{
	
	String Actual_Result=driver.getCurrentUrl();
	
	if(Expected_Result.equals(Actual_Result))
	{
		System.out.println("I am in dws page");
	System.out.println("I am ready to do actions");
	}
	else 
	{
		System.out.println(" I am not in dws page");
	
	}
	String email_id=ReadPropertiesDWS.property("email");	
	String pwd=ReadPropertiesDWS.property("password");
	
	DWSLogin ds=new DWSLogin(driver);
	ds.login(email_id, pwd);

	
}

@AfterMethod
public void logout() 
{
	DWSLogout dl=new DWSLogout(driver);
	
	dl.logOut().click();
}
@AfterClass
public void postCondition() 
{
driver.quit();	
}
@AfterTest
public void afterTest() 
{
	System.out.println("After Test");	
}
@AfterSuite
public void afterSuite() 
{
	System.out.println("After Suite");	
}
}

