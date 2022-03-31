package sandbox;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import abstractbean.AbstractBean;


@Named
@ViewScoped
public class FormularBean extends AbstractBean {
	
private String greeting;
	
	@PostConstruct
	public void init() {
		this.greeting = "Hello Formular Sandbox";
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

}
