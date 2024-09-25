package priorityInTestng;

import org.testng.annotations.Test;

public class PriorityForFlightReservByxml {
	
	@Test(priority=-1)
	public void SignIn() {
		System.out.println("User SignIn");
	}

	@Test(priority=0)
	public void Login() {
		System.out.println("User Login");
	}
	
	@Test(priority=1)
	public void SearchFlight() {
		System.out.println("User SearchFlight");
	}
	
	@Test(priority=2)
	public void BookFlight() {
		System.out.println("User BookFlight");
	}
	
	@Test(priority=3)
	public void SaveTicket() {
		System.out.println("User SaveTicket");
	}
	
	@Test(priority=4)
	public void Logout() {
		System.out.println("User LogOut");
	}
	
}
