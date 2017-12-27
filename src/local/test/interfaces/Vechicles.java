package local.test.interfaces;

public class Vechicles {
	public static void main(String[] args) {
		IVehicles v = new VehiclesImpl();
		IVehicles v1 = new VehiclesNewImpl();
		
		System.out.println("Producer :: "+IVehicles.producer());
		System.out.println("Vechicles list :: "+v.vehiclesList());
		System.out.println("Overview :: "+v.getOverview());
		System.out.println("New Overview :: "+v1.getOverview());
	}
}
