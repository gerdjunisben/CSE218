package p5;

import java.util.ArrayList;

public class PQueue 
{
	private ArrayList<Student> list;
	
	public PQueue()
	{
		list = new ArrayList<>();
	}
	
	public boolean isEmpty()
	{
		return list.size() == 0;
	}
	
	
	
	public void insert(Student value)
	{

		int index;
		for(index = list.size()-1;index>=0;index--)
		{
			if(!(list.get(index).compareTo(value)<0))
			{
				break;
			}
		}
		list.add(index+1, value);
		
	}
	
	public Student remove()
	{
		return list.remove(0);
	}
}
