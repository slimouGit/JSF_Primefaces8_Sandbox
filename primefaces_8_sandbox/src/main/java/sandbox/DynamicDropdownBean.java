package sandbox;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import abstractbean.AbstractBean;


@Named
@ViewScoped
public class DynamicDropdownBean extends AbstractBean {
	
private String greeting;
	
	@PostConstruct
	public void init() {
		this.greeting = "dynamic dropdown";
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

}
