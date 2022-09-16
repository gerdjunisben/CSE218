package p5;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bag<Name> bag = new Bag<>(10);
		bag.insert(new Name("Benjamin","Gerdjunis"));
		bag.insert(new Name("Andrew","Scarddino"));
		bag.insert(new Name("Sean","Issac"));
		
		bag.display();
		ArrayList<Name> arr = bag.search((n) -> "Gerdjunis".equals(((Name)n).getLastName()));
		System.out.println(arr);
	}

}
