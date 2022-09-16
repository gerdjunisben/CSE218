package p1;

public class Student implements Comparable<Student>
{
	private String name;
	private int age;
	private double gpa;
	public Student(String name, int age, double gpa) {
		super();
		this.name = name;
		this.age = age;
		this.gpa = gpa;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gpa=" + gpa + "]";
	}
	@Override
	public int compareTo(Student o) 
	{
		//return this.name.compareTo(o.name);
		//return Integer.compare(this.age, o.age);
		return -Double.compare(this.gpa, o.gpa);
	}
	 
}
