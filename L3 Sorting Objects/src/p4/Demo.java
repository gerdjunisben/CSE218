package p4;

import java.util.Arrays;
import java.util.Comparator;

public class Demo {

	public static void main(String[] args) 
	{
		Student s1 = new Student("M",20,4.0);
		Student s2 = new Student("A",22,3.5);
		Student s3 = new Student("L",40,1.2);
		Student s4 = new Student("N",98,2.1);
		Student s5 = new Student("J",12,3.0);
		
		Student[] arr = {s1,s2,s3,s4,s5};
		
		//causes a ClassCastException
		//unchecked exceptions are exceptions that the compiler does not catch before runtime
		try
		{
			Arrays.sort(arr, (o1,o2)->{
				return o1.getName().compareTo(o2.getName());
			});//sorts by comparator
			//this time it is a lambda expression of the compareTo method of comparable
			
		}
		catch(ClassCastException e)
		{
			e.printStackTrace();
		}
		
		
		for(Student s:arr)
		{
			System.out.println(s);
		}
		
		
		System.out.println(arr[Arrays.binarySearch(arr, s2)]);
	}
	

}
