package sandbox.validation;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.context.FacesContext;

@ApplicationScoped
public class OrderValidatorService {
	
	public String validateOrder(Order order) {
		FacesContext fc = FacesContext.getCurrentInstance();
		String message = "";
		System.out.println("Order " + order);
		System.out.println("Order orderDate " + order.getOrderDate());
		System.out.println("Order shipingDate " + order.getShippingDate());
		System.out.println("Order deliveryDate " + order.getDeliveryDate());
		return message;
	}

}
