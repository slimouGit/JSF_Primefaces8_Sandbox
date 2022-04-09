package sandbox.datatable;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import abstractbean.AbstractBean;

@Named
@ViewScoped
public class DatatableBean extends AbstractBean {
	
	@Inject
	private PersonService personService;
	
	private String title;
	private List<Person> persons;
	
	@PostConstruct
	public void init() {
		this.title = "data table";
		this.persons = this.personService.generatePersonList();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}
	

}
