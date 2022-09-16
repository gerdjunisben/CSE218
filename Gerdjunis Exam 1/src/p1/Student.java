package p1;

public class Student implements Comparable<Student> {
	private String name;
	private double gpa;
	private String major;
	
	public Student(String name, double gpa, String major) {
		super();
		this.name = name;
		this.major = major;
		if(gpa>4)
		{
			gpa = 4.0;
		}
		else if(gpa <0)
		{
			gpa = 0;
		}
		else
		{
			this.gpa = gpa;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		if(gpa>4)
		{
			gpa = 4.0;
		}
		else if(gpa <0)
		{
			gpa = 0;
		}
		else
		{
			this.gpa = gpa;
		}
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + ", major=" + major + "]";
	}
	@Override
	public int compareTo(Student o) {
		return Double.compare(this.gpa, o.gpa);
	}
	
	
	
	
}
