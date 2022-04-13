package sandbox.inputcomponents;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import abstractbean.AbstractBean;
import sandbox.validation.Order;

@Named
@ViewScoped
public class InputComponentBean1 extends AbstractBean {
	
	private String title;
	private String name;
	
	@PostConstruct
	public void init() {
		this.title = "inputComponent1";
	}
	
	public void nameListener() {
		System.out.println("Name " + this.name);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
