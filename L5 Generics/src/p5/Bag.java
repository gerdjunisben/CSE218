package p5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Bag <E> {
	private ArrayList<E> list;
	
	
	public Bag(int initialSize)
	{
		list = new ArrayList<>(initialSize);
	}
	
	
	
	public void insert(E value)
	{
		list.add(value);
	}
	
	public ArrayList<E> search(Predicate predicate)
	{
		ArrayList<E> temp = new ArrayList<>(list.size());
		for(int x =0 ;x<list.size();x++)
		{
			if(predicate.test(list.get(x)))
			{
				temp.add(list.get(x));
			}
		}
		return temp;
	}
	
	public void display()
	{
		for(int x =0;x<list.size();x++)
		{
			System.out.println(list.get(x));
		}
	}
	
	
}
