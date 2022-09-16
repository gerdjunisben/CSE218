package p6;

public class Student implements Comparable<Student>{
	private String name,id;
	private double gpa;
	private static int idCount = 0;
	public Student(String name,double gpa) {
		super();
		this.name = name;
		this.gpa = gpa;
		id = ""+idCount++;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", gpa=" + gpa + "]";
	}
	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.getName());
	}
	
	
}
