package p1;

public class Demo {

	public static void main(String[] args) 
	{
		/*
		StackX stack = new StackX(5);
		
		while(!stack.isFull())
		{
			stack.push((long)(Math.random() *500));
		}
		
		while(!stack.isEmpty())
		{
			System.out.println(stack.pop());
		}
		*/

		StackY stack2 = new StackY();

		for(int x = 0;x<5;x++)
		{
			stack2.push((long)(Math.random() *500));
			System.out.println(stack2.peek());
		}
		
		while(!stack2.isEmpty())
		{
			System.out.println(stack2.pop());
		}
	}

}
