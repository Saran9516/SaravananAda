package pages;

import javax.lang.model.element.Element;

import org.basepage.BasePage;

import pageObject.HomeScreen;


public class HomePage {
	
	
	HomeScreen homeScreen;
	BasePage basePage;
	
	
	public HomePage(){
		basePage = new BasePage();
		homeScreen = new HomeScreen();
		
		
	}



    public void setLocation(String location) {
    	basePage.selectFromDropDown(homeScreen.getLocation(), location);
    	
    }

    public void setHotel(String hotel) {
        basePage.selectFromDropDown(homeScreen.getHotels(), hotel);
        
    }

    public void setRoomType(String roomType) {
        basePage.selectFromDropDown(homeScreen.getRoomType(), roomType);
        
    }
    
    public void setNumberOfRooms(String NumberOfRooms){
    	basePage.selectFromDropDown(homeScreen.getNumberOfRooms(), NumberOfRooms);
    	
    }

    public void setCheckInDate(String checkInDate) {
        basePage.setText(homeScreen.getCheckInDate(), checkInDate);
        
      
    }

    public void setCheckOutDate(String checkOutDate) {
        basePage.setText(homeScreen.getCheckOutDate(), checkOutDate);
    }

    public void setAdultsPerRoom(String adultsPerRoom) {
        basePage.selectFromDropDown(homeScreen.getAdultsPerRoom(), adultsPerRoom);
    }

    public void setChildrenPerRoom(String childrenPerRoom) {
        basePage.selectFromDropDown(homeScreen.getChildrenPerRoom(), childrenPerRoom);
        
    }

    public void clickSearchButton() {
        basePage.buttonClick(homeScreen.getSearchButton());
    }

}
