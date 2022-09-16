package p1;

import java.util.TreeMap;
import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.insert(50, 50.5);
		tree.insert(40, 40.5);
		tree.insert(60, 60.5);
		tree.insert(30, 30.5);
		tree.insert(70, 70.5);
		tree.insert(20, 20.5);
		tree.insert(80, 80.5);
		tree.insert(10, 10.5);
		
		tree.find(50).displayNode();
		tree.minimum().displayNode();
		tree.maximum().displayNode();
		
		tree.delete(40);

		System.out.println();
		
		tree.traverse(1);
		
		System.out.println();
		
		tree.traverse(2);
		
		System.out.println();
		
		tree.traverse(3);

		TreeMap<Integer,String> tm = new TreeMap<>();
		tm.put(1, "a");
		TreeSet<String> ts = new TreeSet<>();
		ts.add("b");
	}

}
