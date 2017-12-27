package local.test.interfaces;

import java.util.Arrays;
import java.util.List;

public class VehiclesNewImpl implements IVehicles {

	@Override
	public List<String> vehiclesList() {
		String[] vehicles = new String[]{"Honda Activa","Honda Hornet"};
		return Arrays.asList(vehicles);
	}
	
	public String getOverview() {
	    return "Overridden getOverview method from VehiclesNewImpl";
	}
}
