package dashboard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class NavigationTargetService {

	public List<NavigationTarget> generateNavigationTargetList() {	
		return new ArrayList<NavigationTarget>(Arrays.asList(
				new NavigationTarget("dynamic-dropdown", "Dynamic Dropdown"),
				new NavigationTarget("validation", "Validation"),
				new NavigationTarget("gridlayout", "Gridlayout")
				));
	}

}
