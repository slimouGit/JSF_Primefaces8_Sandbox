package sandbox.validation;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ApplicationScoped
public class OrderValidatorService {
	
	public void validateOrder(Order order) throws ValidatorException {
		if(!order.getOrderDate().isBefore(order.getShippingDate())){
            throw new ValidatorException(new FacesMessage("shippingDate cant be after orderDate"));
        }
		if(!order.getShippingDate().isBefore(order.getDeliveryDate())){
            throw new ValidatorException(new FacesMessage("deliveryDate cant be after shippingDate"));
        }
		
		
	}

}
