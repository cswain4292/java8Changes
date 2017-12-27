package local.test.interfaces;

import java.util.List;

public interface IVehicles {
	
	static String producer() {
	    return "Honda";
	}
	
	default String getOverview() {
	    return "ATV made by " + producer();
	}
	
	public List<String> vehiclesList();

	
}
