package sandbox.validation;

import java.io.Serializable;

import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import abstractbean.AbstractBean;

@Named
@ViewScoped
public class OrderValidatorBean implements Serializable {
	
	@Inject
	private OrderValidatorService orderValidatorService;
	
	public void validateOrder(Order order) {
		try {
			this.orderValidatorService.validateOrder(order);			
		}catch(ValidatorException ve) {
			System.out.println("Error " + ve.getMessage());
		}
	}

	public OrderValidatorService getOrderValidatorService() {
		return orderValidatorService;
	}
	
	

}
