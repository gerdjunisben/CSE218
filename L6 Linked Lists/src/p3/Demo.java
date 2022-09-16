package p3;

public class Demo {

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		
		list.insertFirst(0);
		list.insertFirst(1);
		list.insertLast(2);
		list.insertLast(3);
		
		list.displayBackward();
		
		list.insertAfter(0, 0);
		
		
		list.insertBefore(3, 3);
		
		
		
		list.displayForward();
		

	}

}
