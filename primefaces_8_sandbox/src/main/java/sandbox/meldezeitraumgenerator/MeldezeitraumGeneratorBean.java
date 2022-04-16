package sandbox.meldezeitraumgenerator;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import abstractbean.AbstractBean;

@Named
@ViewScoped
public class MeldezeitraumGeneratorBean extends AbstractBean {
	
	private String title;
	
	@PostConstruct
	public void init() {
		this.title = "MeldezeitraumKomponente";
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
