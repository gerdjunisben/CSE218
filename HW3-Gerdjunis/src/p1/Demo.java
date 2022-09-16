package p1;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GStack<Integer> stack = new GStack<>();
		
		stack.push(12);
		stack.push(7);
		stack.push(3);
		
		while(!stack.isEmpty())
		{
			System.out.println(stack.pop());
		}
	}

}
