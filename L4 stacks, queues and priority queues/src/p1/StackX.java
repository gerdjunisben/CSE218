package p1;

public class StackX
{
	private long[] stackArray;
	private int top;
	private int maxSize;
	
	public StackX(int maxSize)
	{
		this.maxSize = maxSize;
		top = -1;
		stackArray = new long[maxSize];
	}
	
	public boolean isEmpty()
	{
		return top==-1;
	}
	
	public boolean isFull()
	{
		return top==maxSize-1;
	}
	
	public void push(long value)
	{
		if(!isFull())
			stackArray[++top] = value;
		else
			System.out.println("Full");
	}
	
	public long pop()
	{
		if(!isEmpty())
			return stackArray[top--];
		else
		{
			System.out.println("Empty");
			return 0;
		}
	}
	
	public long peek()
	{
		if(!isEmpty())
			return stackArray[top];
		else
			return 0;
	}
}
