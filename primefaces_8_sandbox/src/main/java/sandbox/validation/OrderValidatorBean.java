package sandbox.validation;

import java.io.Serializable;

import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import abstractbean.AbstractBean;

@Named
@ViewScoped
public class OrderValidatorBean implements Serializable {
	
	@Inject
	private OrderValidatorService orderValidatorService;
	
	

	public OrderValidatorService getOrderValidatorService() {
		return orderValidatorService;
	}
	
	

}
