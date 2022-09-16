package p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Demo {
	public static void main(String[] args)
	{
		Name n1 = new Name("Ben","Gerdjunis");
		Name n2 = new Name("Kevin","Lynch");
		Name n3 = new Name("Luke","Daddino");
		
		Name[] arr = {n1,n2,n3};
		
		ArrayList<Name> list = new ArrayList<>();
		
		list.add(n1);
		list.add(n2);
		list.add(n3);
		
		ArrayList<String> strList = new ArrayList<>();
		
		strList.add("A");
		strList.add("B");
		strList.add("C");
		
		
		Arrays.sort(arr, (name1,name2)->{
			return name1.getLastName().compareTo(name2.getLastName());
		});
		
		list.sort((name1,name2)->{
			return name1.getFirstName().compareTo(name2.getFirstName());
		});
		
		System.out.println(list);

		for(Name name : arr)
		{
			System.out.println(name);
		}
		
		Collections.sort(strList, (s1,s2)->{
			return -s1.compareTo(s2);
		});
		
		System.out.println(strList);
		
		ArrayList list2 = new ArrayList();
		//no generic makes it an object list
		//discouraged
		//can't use any methods since everything is casted as object
	}
}
