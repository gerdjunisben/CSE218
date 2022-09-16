package p6;

public class Demo {

	public static void main(String[] args) {
		ComparableBag<Student> bag = new ComparableBag<>(Student.class,50);
		
		bag.insert(new Student("A",1.3));
		bag.insert(new Student("Z",2.7));
		bag.insert(new Student("X",3.1));
		bag.insert(new Student("R",3.3));
		
		int x = bag.search((s)->{
			return ((Student)s).getName().equalsIgnoreCase("A");
		});
		
		System.out.println(x);
		
		bag.remove((s)->{
			return ((Student)s).getName().equalsIgnoreCase("A");
		});
		
		bag.remove((s)->{
			return ((Student)s).getId().equalsIgnoreCase("1");
		});
		
		bag.remove((s)->{
			return ((Student)s).getGpa()==3.1;
		});
		
		bag.display();
		

	}

}
