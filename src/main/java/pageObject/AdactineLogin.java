package pageObject;

import org.basepage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactineLogin extends BasePage{
	
	
	//using annotation
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//*[@id='login']")
	WebElement login;
	
	
	
	//using constructor
	public  AdactineLogin() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);  //this refers to current class object
		
		//encapsulation---get and set method
	}



	public WebElement getUsername() {
		return username;
	}



	public void setUsername(WebElement username) {
		this.username = username;
	}



	public WebElement getPassword() {
		return password;
	}



	public void setPassword(WebElement password) {
		this.password = password;
	}



	public WebElement getLogin() {
		return login;
	}



	public void setLogin(WebElement login) {
		this.login = login;
	}
	

}
