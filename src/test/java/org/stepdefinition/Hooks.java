package org.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.basepage.BasePage;
import org.testng.xml.LaunchSuite;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BasePage {
	@Before
	public void beforeExecution(){
		System.out.println("This will run before each scenario");
		Launch();
		
	}
	@After
	public void afterExecution(){
		System.out.println("This will run after each scenario");
		quiteDriver();
	}

}
