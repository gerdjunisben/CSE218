package p4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Bag <E> {
	private E[] arr;
	private int nElems;
	
	/*
	public Bag(int maxSize)
	{
		nElems = 0;
		arr = ((E[])(new Object[maxSize]));
	}
	*/
	
	//a reflection
	//allows you to decide what class is compared at runtime 
	public Bag(Class<E> clazz,int maxSize)
	{
		arr = (E[]) Array.newInstance(clazz, maxSize);
	}
	
	public void insert(E value)
	{
		arr[nElems++] = value;
	}
	
	public E[] search(Class<E> clazz,E value)
	{
		E[] temp = (E[]) Array.newInstance(clazz, nElems);
		int count = 0;
		for(int x =0 ;x<nElems;x++)
		{
			if(arr[x].equals(value))
			{
				temp[count++] = arr[x];
			}
		}
		return Arrays.copyOf(temp, count);
	}
	
	public void display()
	{
		for(int x =0;x<nElems;x++)
		{
			System.out.println(arr[x]);
		}
	}
	
	
}
