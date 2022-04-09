package sandbox.validation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator(value = "deliveryDateValidator")
public class deliveryDateValidator implements Validator {
	@Override
	public void validate(FacesContext context, UIComponent component, Object object) throws ValidatorException {
		if(null == object) {
			FacesMessage fm = new FacesMessage("DeliveryDate is missing");
			throw new ValidatorException(fm);
		}else {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			String dateAsString = object.toString();
		
			LocalDate date = LocalDate.parse(dateAsString, formatter);
			if(date.isAfter(LocalDate.now())){
				FacesMessage fm = new FacesMessage("DeliveryDate cant be in future");
				throw new ValidatorException(fm);
			}
		}
	}
}

