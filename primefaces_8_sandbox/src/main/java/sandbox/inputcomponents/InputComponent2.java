package sandbox.inputcomponents;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import abstractbean.AbstractBean;
import sandbox.validation.Order;

@Named
@ViewScoped
public class InputComponent2  extends AbstractBean {
	
	private String title;
	
	@PostConstruct
	public void init() {
		this.title = "inputComponent2";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	

}
