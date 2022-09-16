package p1;
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
		
	public E peek()
	{
		return list.get(list.size()-1);
	}
	

}
