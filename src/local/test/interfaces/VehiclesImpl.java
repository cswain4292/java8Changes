package local.test.interfaces;

import java.util.Arrays;
import java.util.List;

public class VehiclesImpl implements IVehicles{

	@Override
	public List<String> vehiclesList() {
		String[] vehicles = new String[]{"Honda City","Honda Amaze"};
		return Arrays.asList(vehicles);
	}
	

}
