package sandbox.validation;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import abstractbean.AbstractBean;

@Named
@ViewScoped
public class OrderBean extends AbstractBean {
	
	@Inject
	private OrderValidatorService orderValidatorService;
	
	private String title;
	private Order order;
	private String year;
	
	@PostConstruct
	public void init() {
		this.title = "validation";
		this.order = new Order();
	}
	
	public void checkOrder() {
		try {
			this.orderValidatorService.validateOrder(this.order);	
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Erfolgreich gespeichert", "Erfolgreich gespeichert");
			FacesContext.getCurrentInstance().addMessage("order-form", message);
		}catch(ValidatorException ve) {
			String errorMessage = ve.getMessage();
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, errorMessage, errorMessage);
			FacesContext.getCurrentInstance().addMessage("order-form", message);
			System.out.println("Error " + ve.getMessage());
		}
	}
	
	public void yearValue() {
		System.out.println("Year Value " + this.year);
	}	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	
	
	

}
