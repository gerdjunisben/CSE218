package p3;

public class Name implements Comparable<Name>{
	private String firstName,lastName;

	public Name(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
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

	@Override
	public String toString() {
		return "Name [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	@Override
	public int compareTo(Name o) {
		// TODO Auto-generated method stub
		return lastName.compareToIgnoreCase(o.lastName);
	}
	
	
}
