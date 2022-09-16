package p1;

import java.util.Arrays;

public class StudentBag {
	private Student[] a;
	private int nElems;
	private int maxSize;
	
	private static String[] names = new String[1000];
	private static int count =0;
	
	
	public StudentBag(int maxSize)
	{
		a=new Student[maxSize];
		nElems = 0;
		this.maxSize = maxSize;
	}
	
	public void insert(Student s)
	{
		if(nElems!=maxSize)
			a[nElems++]  = s;
	}
	
	public long binarySearchByName(String s)
	{
		Student[] temp = sort();
		Student student = new Student(s,0,0);
		return binarySearch(0,temp.length,student,temp);
	}
	
	public long binarySearch(int start,int end,Student s,Student[] arr)
	{
		if(end>=start)
		{
			int mid = ((end-start) + start)/2;
			if(arr[mid]==s)
				return System.nanoTime();
			else if(arr[mid].compareTo(s) <0)
			{
				return binarySearch(mid +1,end,s,arr);
			}
			else
			{
				return binarySearch(start,mid-1,s,arr);
			}
		}
		return System.nanoTime();
	}
	
	public Student[] sort()
	{
		Student[] temp = Arrays.copyOf(a, nElems);
		
		Arrays.sort(temp);
		
		return temp;
	}
	
	public long searchByName(String name)
	{
		long startTime = System.nanoTime();
		long endTime;
		for(int x = 0;x<nElems;x++)
		{
			if(a[x].getName().equals(name))
			{
				endTime = System.nanoTime();
				return endTime-startTime;
			}
		}
		endTime = System.nanoTime();
		return endTime-startTime;
	}
	
	public void fill(int n)
	{
		int start=nElems;
		long startTime = System.nanoTime();
		while(nElems<maxSize && (nElems-start)<n)
		{
			String name = getName();
			a[nElems++] = new Student(name,getAge(),getGpa());
			names[count++] = name;
		}
		long endTime = System.nanoTime();
		System.out.println(endTime-startTime);
	}
	
	public void display()
	{
		for(int x =0;x<nElems;x++)
		{
			System.out.println(a[x]);
		}
	}
	
	private int getAge()
	{
		int max = 41;
		int min = 18;
		return (int)((Math.random() * (max - min)) + min);
	}
	
	private double getGpa()
	{
		int max = 4;
		int min = 0;
		return ((Math.random() * (max - min)) + min);
	}
	
	private String getName()
	{
		String name = "";
		
		int min =65;
		int max =90 + 1;//(max + 1)
		int randomNumber = (int)((Math.random() * (max - min)) + min);
		name += (char) randomNumber;
		
		min = 97;
		max = 122 + 1; 
		for(int x =0;x<4;x++)
		{
			randomNumber = (int)((Math.random() * (max - min)) + min);
			name += (char) randomNumber;
		}
		
		
		return name;
	}
	
	public String[] get20Names()
	{
		return Arrays.copyOf(names, 20);
	}
}
