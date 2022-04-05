package sandbox.validation;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import abstractbean.AbstractBean;

@Named
@ViewScoped
public class ValidationBean extends AbstractBean {
	
	private String title;
	
	@PostConstruct
	public void init() {
		this.title = "validation";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
	

}
