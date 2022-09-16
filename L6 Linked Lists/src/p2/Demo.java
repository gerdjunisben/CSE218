package p2;

public class Demo {

	public static void main(String[] args) {
		FirstLastList myList = new FirstLastList();
		
		myList.insertLast(0);
		myList.insertLast(1);
		myList.insertLast(2);
		myList.insertLast(3);
		

		while(!myList.isEmpty())
		{
			System.out.println(myList.deleteFirst());
		}
		

	}

}
