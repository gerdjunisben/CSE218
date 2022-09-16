package p2;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Name[] nameArr = {new Name("William","Daddino"),new Name("Chris","Smith"),new Name("Tyler","Graziani")};
		Student[] studentArr = {new Student("Sean",4.0),new Student("Draven",2.6),new Student("Joe",0.3)};
		
		display(nameArr);
		display(studentArr);
	}

	/*
	//overloaded signature are different but share a name
	private static void display(Student[] arr)
	{
		for(Student s:arr)
		{
			System.out.println(s);
		}
	}
	
	private static void display(Name[] arr)
	{
		for(Name n:arr)
		{
			System.out.println(n);
		}
	}
	*/
	
	//conversion occurs during compile time not run time
	//erasure : replaces this method with as many as needed for the data types that use it
	//in this case a name and student version are made
	//effects compile not run so feel free to use and abuse
	private static <E> void display(E[] arr)
	{
		System.out.println(Arrays.toString(arr));
	}
}
