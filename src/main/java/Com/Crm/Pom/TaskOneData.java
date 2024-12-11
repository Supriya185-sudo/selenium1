package Com.Crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskOneData {
public TaskOneData(WebDriver driver)
{
PageFactory.initElements(driver, this);	
}
@FindBy(linkText = "$25 Virtual Gift Card")
private WebElement gift_link;
@FindBy(id = "giftcard_2_RecipientName")
private WebElement rec_name;
@FindBy(name = "giftcard_2.RecipientEmail")
private WebElement rec_email;
@FindBy(id = "giftcard_2_SenderName")
private WebElement your_name;
@FindBy(css = "input[name='giftcard_2.SenderEmail']")
private WebElement your_email;
@FindBy(xpath = "//textarea[@id='giftcard_2_Message']")
private WebElement message;
@FindBy(id = "addtocart_2_EnteredQuantity")
private WebElement qty;
@FindBy(xpath = "(//input[@value='Add to cart'])[1]")
private WebElement addtocart;
@FindBy (linkText = "shopping cart")
private WebElement shoppingcart;
@FindBy(xpath = "//td[@class='product']")
private WebElement products;

public WebElement giftLink() 
{
return 	gift_link;
}
public WebElement recName() 
{
return 	rec_name;
}
public WebElement recEmail() 
{
return 	rec_email;
}
public WebElement yourName() 
{
return 	your_name;
}
public WebElement yourEmail() 
{
return 	your_email;
}
public WebElement message() 
{
return 	message;
}
public WebElement qty() 
{
return 	qty;
}
public WebElement addToCart() 
{
return 	addtocart;
}
public WebElement shoppingCart() 
{
return 	shoppingcart;
}
public WebElement products() 
{
return 	products;
}

}
