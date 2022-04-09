package sandbox.datatable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import abstractbean.AbstractBean;

@Named
@ViewScoped
public class DatatableBean extends AbstractBean {
	
	private String title;
	
	@PostConstruct
	public void init() {
		this.title = "data table";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	

}
