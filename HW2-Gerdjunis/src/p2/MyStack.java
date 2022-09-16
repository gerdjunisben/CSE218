package p2;

public class MyStack {
	private String[] stackArray;
	private int top;
	private int maxSize;
	
	public MyStack(int maxSize)
	{
		this.maxSize = maxSize;
		top = -1;
		stackArray = new String[maxSize];
	}
	
	public boolean isEmpty()
	{
		return top==-1;
	}
	
	public boolean isFull()
	{
		return top==maxSize-1;
	}
	
	public void push(String value)
	{
		if(!isFull())
			stackArray[++top] = value;
		else
			System.out.println("Full");
	}
	
	public String pop()
	{
		if(!isEmpty())
			return stackArray[top--];
		else
		{
			System.out.println("Empty");
			return null;
		}
	}
	
	public String peek()
	{
		if(!isEmpty())
			return stackArray[top];
		else
			return null;
	}
}
