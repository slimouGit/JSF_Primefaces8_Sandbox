package dashboard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class VehicleTypeService {

	public List<String> generateVehicleList() {
		return new ArrayList<String>(Arrays.asList(
				"Car", "MotorCycle", "Truck"
				));
	}

}
