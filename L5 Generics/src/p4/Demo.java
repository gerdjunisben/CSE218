package p4;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bag<Name> bag = new Bag<>(Name.class,10);
		bag.insert(new Name("Benjamin","Gerdjunis"));
		bag.insert(new Name("Andrew","Scarddino"));
		bag.insert(new Name("Sean","Issac"));
		
		bag.display();
		Name[] arr = bag.search(Name.class,new Name("Benjamin","Gerdjunis"));
		System.out.println(Arrays.toString(arr));
	}

}
