package p4;


public class Student implements Comparable<Student>
{
	private double gpa;
	private String name;
	
	
	public Student(double gpa, String name) {
		super();
		this.gpa = gpa;
		this.name = name;
	}


	public double getGpa() {
		return gpa;
	}


	public void setGpa(double gpa) {
		this.gpa = gpa;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Student [gpa=" + gpa + ", name=" + name + "]";
	}




	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.getName());
	}
}
