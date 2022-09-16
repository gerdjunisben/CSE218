package p5;


public class Student implements Comparable<Student> {
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
		int a = -this.name.compareTo(o.name);
		if(a == 0)
		{
			a = Double.compare(this.gpa, o.gpa);
		}
		return a;
	}
	
	
	
	
}
