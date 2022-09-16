package p4;

public class Demo {
	public static void main(String[] args)
	{
		//you may also use the one in java api see next demo
		LinkList list = new LinkList();
		ListIterator iterator = list.getIterator();
		
		iterator.insertAfter(0);
		iterator.insertAfter(1);
		iterator.insertAfter(2);
		iterator.insetBefore(3);
		
		list.display();
		
		
		iterator.reset();
		iterator.insertAfter(7);
		
		list.display();
	}
}
