package dashboard;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import abstractbean.AbstractBean;

@Named
@ViewScoped
public class DashboardBean extends AbstractBean {
	
	private String greeting;
	
	@PostConstruct
	public void init() {
		this.greeting = "Hello Primefaces 8";
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	
	
	
}
