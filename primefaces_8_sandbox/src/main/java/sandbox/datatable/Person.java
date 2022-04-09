package sandbox.datatable;

public class Person {
	
	private String forname;
	private String lastname;
	private String gender;
	private String birthday;
	private String phonenumber;
	private String email;
	
	public Person() {
	}
	
	public Person(String forname, String lastname, String gender, String birthday, String phonenumber, String email) {
		super();
		this.forname = forname;
		this.lastname = lastname;
		this.gender = gender;
		this.birthday = birthday;
		this.phonenumber = phonenumber;
		this.email = email;
	}
	
	public String getForname() {
		return forname;
	}
	public void setForname(String forname) {
		this.forname = forname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
