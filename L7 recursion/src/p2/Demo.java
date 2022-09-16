package p2;

public class Demo {
	
	private static int count  = 0;
	public static void main(String[] args)
	{
		
		
		/* while does not get stack overflow since things are pushed and then popped 
		while(true)
		{
			System.out.println("hi");
		}
		*/
		
		/*recursion does cause stack overflow since each method adds another method to the
		 * stack making it eventually overflow
		show();
		*/
		
		show(count);
	}
	
	public static void show()
	{
		System.out.println("Hi");
		show();
	}
	
	public static void show(int c)//inefficient memory wise
	{
		if(c==10)//base case
		{
			return;
		}
		show(++c);
		System.out.println("Hi");
	}
	
}
