package p4;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bag<Student> bag = new Bag<>(Student.class,10);
		bag.insert(new Student(3.7,"Zack"));
		bag.insert(new Student(3.4,"Smitty"));
		bag.insert(new Student(3.5,"Ben"));
		bag.insert(new Student(4.0,"JAC"));
		bag.insert(new Student(3.6,"Draven"));
		
		bag.display();
		System.out.println();
		Student str = bag.search((n) -> "Ben".equals(((Student)n).getName()));
		System.out.println(str);
		bag.delete((n) -> "Ben".equals(((Student)n).getName()));
		System.out.println();
		bag.display();
		bag.insert(new Student(2.0,"Kevin"));
		System.out.println();
		bag.display();
	}

}
