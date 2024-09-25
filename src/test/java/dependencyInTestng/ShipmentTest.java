package dependencyInTestng;

import org.testng.annotations.Test;

public class ShipmentTest {
	String shipmentNo;
	
	@Test
	public void createShipment() {
		System.out.println("create shipment");
		shipmentNo="123456";
	}
	
	@Test (dependsOnMethods="createShipment")
	public void trackShipment() {
		System.out.println(10/0);
//		if(shipmentNo!=null) {
//			System.out.println(shipmentNo);
//		}
//		else {
//			System.out.println("Exception in shipmentNo");
//		}
	}
	
	@Test (dependsOnMethods={"trackShipment"})
	public void cancelShipment() {
		System.out.println("inside cancel shipment");
	}

}
