package Com.Crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWSLogin {
public DWSLogin(WebDriver driver) 
{
PageFactory.initElements(driver, this);	
}
@FindBy(linkText  = "Log in")
private WebElement login;
@FindBy(id = "Email")
private WebElement email_id;
@FindBy(name = "Password")
private WebElement password;
@FindBy(xpath = "(//input[@type='submit'])[2]")
private WebElement login_button;

public void login(String emailId,String pwd) 
{
login.click();
email_id.sendKeys(emailId);
password.sendKeys(pwd);
login_button.click();
}


}
