package p1;

import java.util.ArrayList;

public class MyStack {
	private ArrayList<Long> list;
	
	public MyStack()
	{
		list = new ArrayList<>(10);
	}
	
	public boolean isEmpty()
	{
		return list.size() ==0;
	}
	
	public long pop()
	{
		return list.remove(list.size()-1);
	}
	
	public void push(long value)
	{
		list.add(value);
	}
	
	public long peek()
	{
		return list.get(list.size()-1);
	}
}
