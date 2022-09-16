package p4;

import java.lang.reflect.Array;
import java.util.function.Predicate;

public class Bag <E> {
	private E[] arr;
	private int nElems;
	
	public Bag(Class<E> clazz,int maxSize)
	{
		arr = (E[]) Array.newInstance(clazz, maxSize);
	}
	
	public void insert(E value)
	{
		arr[nElems++] = value;
	}
	

	
	public E search(Predicate predicate)
	{
		for(int x =0 ;x<nElems;x++)
		{
			if(predicate.test(arr[x]))
			{
				return arr[x];
			}
		}
		return null;
	}
	
	public E delete(Predicate predicate)
	{
		int index;
		E elem = null;
		for(index =0 ;index<nElems;index++)
		{
			if(predicate.test(arr[index]))
			{
				elem = arr[index];
				break;
			}
		}
		if(elem==null)
			return null;
		else
		{
			for(int x = index;x<nElems-1;x++)
			{
				arr[x] = arr[x+1];
			}
			nElems--;
			return elem;
		}
	}
	
	public void display()
	{
		for(int x =0;x<nElems;x++)
		{
			System.out.println(arr[x]);
		}
	}
	
	
}
