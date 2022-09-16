package p2;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GStack<Integer> stack = new GStack<>();
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(16);
		list.add(45);
		
		stack.pushAll(list);
		
		while(!stack.isEmpty())
		{
			System.out.println(stack.pop());
		}
	}

}
