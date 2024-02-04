package org.stepdefinition;

import org.basepage.BasePage;

import io.cucumber.java.en.Then;
import pageObject.HomeScreen;
import pages.AdactineLoginPage;
import pages.HomePage;



public class homePage extends BasePage {
	
	AdactineLoginPage adactineLoginPage;
	BasePage  basepage;
	HomePage homepage;
	
	public homePage(){
		adactineLoginPage = new AdactineLoginPage();
		basepage = new BasePage();
		homepage = new HomePage();
		
		
	}






@Then("select location drop down")
public void select_location_drop_down() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
 Thread.sleep(2000);
 
 homepage.setLocation("Sydney");
 
 
 
}
@Then("select the Hotels")
public void select_the_hotels() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
	homepage.setHotel("Hotel Creek");
   
}
@Then("select the Room types")
public void select_the_room_types() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
	homepage.setRoomType("Standard");
   
}
@Then("select number of rooms")
public void select_number_of_rooms() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
	homepage.setNumberOfRooms("1");
   
}
@Then("Add check in date")
public void add_check_in_date() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(2000);
	homepage.setCheckInDate("30/03/2024");
    
}
@Then("Add check out date")
public void add_check_out_date() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
	homepage.setCheckOutDate("31/03/2024");
	
   
}
@Then("select adults per room drop down")
public void select_adults_per_room_drop_down() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
	homepage.setAdultsPerRoom("2");
   }
@Then("select childrens per room drop down")
public void select_childrens_per_room_drop_down() {
    // Write code here that turns the phrase above into concrete actions
	homepage.clickSearchButton();
   
}
}


