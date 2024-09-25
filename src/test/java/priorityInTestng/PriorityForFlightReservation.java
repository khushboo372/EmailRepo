package priorityInTestng;

import org.testng.annotations.Test;

public class PriorityForFlightReservation {
	
	@Test
	public void SignIn() {
		System.out.println("User SignIn");
	}

	@Test
	public void Login() {
		System.out.println("User Login");
	}
	
	@Test
	public void SearchFlight() {
		System.out.println("User SearchFlight");
	}
	
	@Test
	public void BookFlight() {
		System.out.println("User BookFlight");
	}
	
	@Test
	public void SaveTicket() {
		System.out.println("User SaveTicket");
	}
	
	@Test
	public void Logout() {
		System.out.println("User LogOut");
	}
	
}
