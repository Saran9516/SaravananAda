package pages;

import org.basepage.BasePage;

import pageObject.AdactineLogin;
import pageObject.HomeScreen;

public class AdactineLoginPage {
	
	AdactineLogin adactineLogin;
	BasePage basePage;
	
	
	
	
	public AdactineLoginPage(){
		basePage = new BasePage();
		adactineLogin = new AdactineLogin();
		
		
		
		
	}
	
	public void login(String username, String password){
		basePage.setText(adactineLogin.getUsername(),username );
		basePage.setText(adactineLogin.getPassword(), password);
		
		
		
	}
	
	public void clickLoginButton(){
		
		basePage.buttonClick(adactineLogin.getLogin());
		
		
		
		
		
		
	}
	


}
