package p2;

import java.util.Arrays;

public class StudentBag {
	Student[] arr;
	int nElems;
	
	public StudentBag(int size)
	{
		arr = new Student[size];
		nElems = 0;
	}
	
	public void insert(Student student)
	{
		arr[nElems++] = student;
	}
	
	public void fill(int numberOfStudents)
	{
		int accum = 0;
		while(accum<numberOfStudents && accum<arr.length-1)
		{
			insert(new Student(generateName(),generateRandomNumber(0.0,4.0),(int)generateRandomNumber(18,40)));
			accum++;
		}
	}
	
	public void displayStudents()
	{
		for(int x =0;x<nElems;x++)
		{
			System.out.println(arr[x]);
		}
	}
	
	public void bubbleSort()
	{
		int out;
		int in;
		for(out = nElems-1;out >=1;out--)
		{
			for(in = 0;in<out;in++)
			{
				if(arr[in].getName().compareTo(arr[in+1].getName())>0)
				{
					swap(in,in+1);
				}
			}
		}
	}
	
	public void selectionSort()
	{
		int out;
		int in;
		int min;
		for(out = 0;out<nElems-1;out++)
		{
			min = out;
			for(in=out+1;in<nElems;in++)
			{
				if(arr[in].getName().compareTo(arr[min].getName())<0)
				{
					min = in;
				}
			}
			swap(out,min);
		}
	}
	
	public void insertionSort()
	{
		int in;
		int out;
		for(out = 1;out<nElems;out++)
		{
			Student temp = arr[out];
			in = out;
			while(in>0&&arr[in-1].getName().compareTo(temp.getName())>0)
			{
				arr[in] = arr[in-1];
				in--;
			}
			arr[in] = temp;
		}
	}
	
	public int sequentialSearch(String name)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].getName().equals(name))
			{
				//doesn't matter what is returned because it is just checking time
				return i;
			}
		}
		return -1;
	}
	
	public int binarySearch(int first,int last,String find)
	{
		if(last>=first)
		{
			int mid = ((last-first)/2) + first;
			if(arr[mid].getName().equals(find))
			{
				return mid;
			}
			else if(find.compareTo(arr[mid].getName())<0)
			{
				return binarySearch(first,mid-1,find);
			}
			else
			{
				return binarySearch(mid+1,last,find);
			}
			
		}
		return -1;
		
	}
	
	public int binarySearch(String find)
	{
		int first = 0;
		int last = nElems;
		if(last>=first)
		{
			int mid = ((last-first)/2) + first;
			if(arr[mid].getName().equals(find))
			{
				return mid;
			}
			else if(arr[mid].getName().compareTo(find)>0)
			{
				return binarySearch(first,mid-1,find);
			}
			else if(arr[mid].getName().compareTo(find)<0)
			{
				return binarySearch(mid+1,last,find);
			}
			
		}
		return -1;
		
	}
	
	public void swap(int one,int two)
	{
		Student temp = arr[one];
		arr[one] = arr[two];
		arr[two] = temp;
	}
	
	public String generateName()
	{
		String name ="";
		
		name+= (char) ((Math.random() *(91-65)) + 65);
		
		for(int x =0;x<4;x++)
		{
			name += (char) ((Math.random() *(123-97)) + 97);
		}
		
		return name;
	}
	
	public double generateRandomNumber(double min,double max)
	{
		return (Math.random() *(max-min)) + min;
	}
	
	public Student[] get20Students()
	{
		return Arrays.copyOf(arr,20);
	}
}
