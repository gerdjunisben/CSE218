package p1;

import java.util.ArrayList;

public class StackY 
{
	private ArrayList<Long> stack;
	
	public StackY()
	{
		stack = new ArrayList<>();
	}
	
	public boolean isEmpty()
	{
		return stack.size()==0;
	}
	
	
	public void push(long value)
	{
		stack.add(value);
	}
	
	public long pop()
	{
		return stack.remove(stack.size()-1);
	}
	
	public long peek()
	{
		return stack.get(stack.size()-1);
	}
}
