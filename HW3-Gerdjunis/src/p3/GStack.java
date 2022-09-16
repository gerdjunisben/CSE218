package p3;
import java.util.ArrayList;

public class GStack <E extends Number> {
	

	private ArrayList<E> list;
		
	public GStack()
	{
		list = new ArrayList<>(10);
	}
		
	public boolean isEmpty()
	{
		return list.size() ==0;
	}
		
	public E pop()
	{
		return list.remove(list.size()-1);
	}
		
	public void push(E value)
	{
		list.add(value);
	}
	
	public void pushAll(ArrayList<E> list2)
	{
		for(int x = 0;x<list2.size();x++)
		{
			push(list2.get(x));
		}
	}
	
	public ArrayList<E> popAll()
	{
		ArrayList<E> temp = new ArrayList<>();
		
		while(!isEmpty())
		{
			temp.add(pop());
		}
		
		return temp;
	}
		
	public E peek()
	{
		return list.get(list.size()-1);
	}
	

}
