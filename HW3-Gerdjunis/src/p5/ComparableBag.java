package p5;

import java.lang.reflect.Array;
import java.util.function.Predicate;

public class ComparableBag <E extends Comparable> {
	private E[] arr;
	private int nElems,maxSize;
	
	public ComparableBag(Class<E> clazz,int maxSize)
	{
		arr = (E[]) Array.newInstance(clazz, maxSize);
	}
	
	public void insert(E value)
	{
		arr[nElems++] = value;
	}
	
	public void remove(Predicate predicate)
	{
		
		int index = search(predicate);
		
		while(index < nElems)
		{
			arr[index] = arr[index+1];
			index++;
		}
		nElems--;
	}
	
	public int search(Predicate predicate)
	{
		for(int x =0 ;x<nElems;x++)
		{
			if(predicate.test(arr[x]))
			{
				return x;
			}
		}
		return -1;
	}
	
	public void display()
	{
		for(int x =0;x<nElems;x++)
		{
			System.out.println(arr[x]);
		}
	}
	
}
