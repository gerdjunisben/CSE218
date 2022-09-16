package p4;

public class MyStack {
	private int[] stackArray;
	private int top;
	private int maxSize;
	
	public MyStack(int maxSize)
	{
		this.maxSize = maxSize;
		top = -1;
		stackArray = new int[maxSize];
	}
	
	public boolean isEmpty()
	{
		return top==-1;
	}
	
	public boolean isFull()
	{
		return top==maxSize-1;
	}
	
	public void push(int value)
	{
		if(!isFull())
			stackArray[++top] = value;
		else
			System.out.println("Full");
	}
	
	public int pop()
	{
		if(!isEmpty())
			return stackArray[top--];
		else
		{
			return -1;
		}
	}
	
}
