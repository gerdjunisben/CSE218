package p5;

import java.util.LinkedList;
import java.util.ListIterator;


public class Demo {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		
		ListIterator<String> iterator = list.listIterator();
		
		iterator.forEachRemaining(s->System.out.println(s));
	}

}
