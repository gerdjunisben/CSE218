package p1;

public class MyPriorityQueue extends MyQueue{
	public MyPriorityQueue()
	{
		super();
	}
	
	@Override
	public void add(long value)
	{
		
		int index;
		for(index = list.size()-1;index>=0;index--)
		{
			if(!(list.get(index)<value))
			{
					break;
			}
		}
		list.add(index+1, value);
	}
}
