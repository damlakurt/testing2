package freeWork;

public class Member {
	
	
	String firstName ;
	String lastName;
	double telNumber ;
	String eMail;
	
	public Member() {
		
	}

	public Member(String firstName, String lastName, double telNumber, String eMail) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.telNumber = telNumber;
		this.eMail = eMail;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(double telNumber) {
		this.telNumber = telNumber;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	
	
	

}
