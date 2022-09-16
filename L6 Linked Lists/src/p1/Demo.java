package p1;

public class Demo {

	public static void main(String[] args) {
		LinkedList myList = new LinkedList();
		myList.insertFirst(1, 1.1);
		myList.delete(1).displayLink();
		myList.insertFirst(2, 2.2);
		myList.insertFirst(3, 3.3);
		myList.insertFirst(4, 4.4);
		
		myList.displayList();
		

	}

}
