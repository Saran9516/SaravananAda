package org.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.AdactineLogin;
import pages.AdactineLoginPage;

public class loginAdactine extends BasePage{

	AdactineLoginPage adactineLoginPage;
	BasePage  basepage;
	
	public loginAdactine(){
		adactineLoginPage = new AdactineLoginPage();
		basepage = new BasePage();
		

	}








	@Given("user is on homepage")
	public void user_is_on_homepage() {
		// Write code here that turns the phrase above into concrete actions
		basepage.Launch();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("User is login page is verified");

	}
	@When("they enter username {string} and password {string}")
	public void they_enter_username_and_password(String username, String password) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		try{
			Thread.sleep(3000);
			adactineLoginPage.login(username, password);
			
		}
		catch(Exception e){
			e.printStackTrace();
			
		}

	}
	@When("user click login button")
	public void user_click_login_button() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		adactineLoginPage.clickLoginButton();

	}
	@Then("user should go to homepage successfully")
	public void user_should_go_to_homepage_successfully() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		System.out.println("User succesfully navigated to homepage is verified");

	}





}
