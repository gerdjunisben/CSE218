package p1;

import java.util.ArrayList;

public class MyQueue {
	protected ArrayList<Long> list;
	
	public MyQueue()
	{
		list = new ArrayList<>(10);
	}
	
	public boolean isEmpty()
	{
		return list.size()==0;
	}
	
	public void add(long value)
	{
		list.add(value);
	}
	
	public long remove()
	{
		return list.remove(0);
	}
}
