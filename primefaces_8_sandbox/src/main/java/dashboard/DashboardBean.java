package dashboard;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import abstractbean.AbstractBean;


@Named
@ViewScoped
public class DashboardBean extends AbstractBean {
	
	private String greeting;
	private List<NavigationTarget> navigation = new ArrayList<>();
	
	@Inject
	private NavigationTargetService navigationTargetService;
	
	
	
	@PostConstruct
	public void init() {
		this.greeting = "Hello Primefaces 8";
		this.navigation = this.navigationTargetService.generateNavigationTargetList();
	}
	
	public String redirect(String target) {
		return "content/"+target + ".xhtml?faces-redirect=true";
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	public List<NavigationTarget> getNavigation() {
		return navigation;
	}

	public void setNavigation(List<NavigationTarget> navigation) {
		this.navigation = navigation;
	}

	
	
	
	
}
