package p5;

public class Demo {

	public static void main(String[] args) 
	{
		Student s1 = new Student("Joe",40,3.7);
		Student s2 = new Student("Joe",40,3.7);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}

}
