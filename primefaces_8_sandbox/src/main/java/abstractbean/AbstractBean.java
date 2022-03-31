package abstractbean;

import java.io.Serializable;

public abstract class AbstractBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public String redirect(String target) {
		return "content/"+target + ".xhtml?faces-redirect=true";
	}

}
