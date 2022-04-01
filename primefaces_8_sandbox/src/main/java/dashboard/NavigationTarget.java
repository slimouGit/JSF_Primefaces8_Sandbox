package dashboard;

public class NavigationTarget {
	
	private String target;
	private String name;	
	
	public NavigationTarget(String target, String name) {
		super();
		this.target = target;
		this.name = name;
	}
	
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
