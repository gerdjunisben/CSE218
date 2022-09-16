package p2;

public class Demo {
	public static void main(String[] args)
	{
		MyStack stack = new MyStack(10);
		String paragraph = " Love isn't always a ray of sunshine. That's "
				+ "what the older girls kept telling her when she said she "
				+ "had found the perfect man. She had thought this was simply"
				+ " bitter talk on their part since they had been unable to "
				+ "find true love like hers. But now she had to face the fact "
				+ "that they may have been right. Love may not always be a ray of sunshine. "
				+ "That is unless they were referring to how the sun can burn! "
				+ "Questions? None? Ok.";
		String[] arr = paragraph.split("\\.|\\?|\\!");
		
		for(int x = 0;x<arr.length;x++)
		{
			stack.push(arr[x]);
		}
		
		while(!stack.isEmpty())
		{
			System.out.println(stack.pop());
		}
		
		MyStack stack2 = new MyStack(600);
		
		char[] arr2 = paragraph.toCharArray();
		
		for(int x = 0;x<arr2.length;x++)
		{
			stack2.push(arr2[x] +"");
		}
		
		while(!stack2.isEmpty())
		{
			System.out.print(stack2.pop());
		}
	}
}
