package sandbox.datatable;

import java.util.ArrayList;
import java.util.Arrays;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PersonService {
	
	public ArrayList<Person> generatePersonList() {
		return new ArrayList<Person>(Arrays.asList(
				new Person("Max","Mustermann","male","01.01.1984","06911223355","max@mustermann.de"),
				new Person("Maria","Musterfrau","female","01.01.1984","06911223355","maria@musterfrau.de")
				));
	}	

}
