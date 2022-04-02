package sandbox;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import abstractbean.AbstractBean;

@Named
@ViewScoped
public class DynamicDropdownBean extends AbstractBean {

	@Inject
	private VehicleTypeService vehicleTypeService;

	private String greeting;
	private String selectedVehicleType;
	private List<String> vehicleTypeList = new ArrayList<>();
	private boolean car;
	private boolean motorcycle;
	private boolean truck;

	@PostConstruct
	public void init() {
		this.greeting = "dynamic dropdown";
		this.vehicleTypeList = this.vehicleTypeService.generateVehicleList();
	}

	public void onVehicleChange() {
		System.out.println("Selected vehicle type " + this.selectedVehicleType);
		this.car = false;
		this.motorcycle = false;
		this.truck = false;
		if (this.selectedVehicleType.equals("Car")) {
			this.car = true;
		}
		if (this.selectedVehicleType.equals("MotorCycle")) {
			this.motorcycle = true;
		}
		if (this.selectedVehicleType.equals("Truck")) {
			this.truck = true;
		}
	}
	
	public void displayVehicle() {
        FacesMessage msg;
        if (this.selectedVehicleType != null) {
            msg = new FacesMessage("Selected Vehicle", this.selectedVehicleType);
        }
        else {
            msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Invalid", "Vehicle is not selected.");
        }

        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public List<String> getVehicleTypeList() {
		return vehicleTypeList;
	}

	public void setVehicleTypeList(List<String> vehicleTypeList) {
		this.vehicleTypeList = vehicleTypeList;
	}

	public String getSelectedVehicleType() {
		return selectedVehicleType;
	}

	public void setSelectedVehicleType(String selectedVehicleType) {
		this.selectedVehicleType = selectedVehicleType;
	}

	public boolean isCar() {
		return car;
	}

	public void setCar(boolean car) {
		this.car = car;
	}

	public boolean isMotorcycle() {
		return motorcycle;
	}

	public void setMotorcycle(boolean motorcycle) {
		this.motorcycle = motorcycle;
	}

	public boolean isTruck() {
		return truck;
	}

	public void setTruck(boolean truck) {
		this.truck = truck;
	}

}
