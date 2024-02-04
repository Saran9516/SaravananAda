package pageObject;

import org.basepage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeScreen extends BasePage{
	
	//using annotation
		@FindBy(xpath="//*[@id='location']")
		WebElement location;
		
		@FindBy(xpath="//*[@id='hotels']")
		WebElement hotels;
		
		@FindBy(xpath="//*[@id='room_type']")
		WebElement RoomType;
		
		@FindBy(xpath="//*[@id='room_nos']")
		WebElement NumberOfRooms;
		
		@FindBy(id="//*[@id='datepick_in']")
		WebElement CheckInDate;
		
		@FindBy(xpath="//*[@id='datepick_out']")
		WebElement CheckOutDate;
		
		@FindBy(xpath="//*[@id='adult_room']")
		WebElement AdultsPerRoom;
		
		@FindBy(xpath="//*[@id='child_room']")
		WebElement ChildrenPerRoom;
		
		
		@FindBy(name="Submit")
		WebElement SearchButton;
		
		
		//using constructor
		public HomeScreen() {
			
			// TODO Auto-generated constructor stub
			PageFactory.initElements(driver, this);  //this refers to current class object
			
			//encapsulation---get and set method
		}


		public WebElement getLocation() {
			return location;
		}


		public void setLocation(WebElement location) {
			this.location = location;
		}


		public WebElement getHotels() {
			return hotels;
		}


		public void setHotels(WebElement hotels) {
			this.hotels = hotels;
		}


		public WebElement getRoomType() {
			return RoomType;
		}


		public void setRoomType(WebElement roomType) {
			RoomType = roomType;
		}


		public WebElement getNumberOfRooms() {
			return NumberOfRooms;
		}


		public void setNumberOfRooms(WebElement numberOfRooms) {
			NumberOfRooms = numberOfRooms;
		}


		public WebElement getCheckInDate() {
			return CheckInDate;
		}


		public void setCheckInDate(WebElement checkInDate) {
			CheckInDate = checkInDate;
		}


		public WebElement getCheckOutDate() {
			return CheckOutDate;
		}


		public void setCheckOutDate(WebElement checkOutDate) {
			CheckOutDate = checkOutDate;
		}


		public WebElement getAdultsPerRoom() {
			return AdultsPerRoom;
		}


		public void setAdultsPerRoom(WebElement adultsPerRoom) {
			AdultsPerRoom = adultsPerRoom;
		}


		public WebElement getChildrenPerRoom() {
			return ChildrenPerRoom;
		}


		public void setChildrenPerRoom(WebElement childrenPerRoom) {
			ChildrenPerRoom = childrenPerRoom;
		}


		public WebElement getSearchButton() {
			return SearchButton;
		}


		public void setSearchButton(WebElement searchButton) {
			SearchButton = searchButton;
		}

}
