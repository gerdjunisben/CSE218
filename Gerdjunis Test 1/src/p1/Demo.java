package p1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;

public class Demo {

	public static void main(String[] args) 
	{
		int[][] arrays = new int[10][1000];
		int[] values = new int[10];
		int accum = 50;
		long[] averageSeqTimes = new long[10];
		long[] averageBinTimes = new long[10];
		
		values = fillWithRandom(values,0,10);
		
		
		for(int x = 0;x<arrays.length;x++)
		{
			for(int y = 0;y<10;y++)
			{
				arrays[x][y] = values[y];
			}
			arrays[x] = fillWithRandom(arrays[x],10,accum);
			Arrays.sort(arrays[x]);
			//I sorted early so the elements are better scrambled since the 10 elements from values
			//are at the front of the array, I believe it is better for showing the differences in
			//efficiency between binary and sequential searches
			accum+=100;
		}
		
		for(int x = 0;x<arrays.length;x++)
		{
			
			for(int i = 0;i<values.length;i++)
			{
				long startTime = System.nanoTime();
				sequentialSearch(values[i],50 + x*100,arrays[x]);
				long endTime = System.nanoTime();
				averageSeqTimes[x] = endTime-startTime;
			}
		}
		printToFile(averageSeqTimes,"SequentialSearchResults");

		/*
		 * I already sorted earlier but this is how I would do it
		 * for(int x = 0;x<arrays.length;x++)
		 * {
		 * 		Arrays.sort(arrays[x]);
		 * }
		 */
		for(int x = 0;x<arrays.length;x++)
		{
			
			for(int i = 0;i<values.length;i++)
			{
				long startTime = System.nanoTime();
				binarySearch(arrays[x],0,50 + x*50,values[i]);
				long endTime = System.nanoTime();
				averageBinTimes[x] = endTime-startTime;
			}
		}
		printToFile(averageBinTimes,"BinarySearchResults");
		
		
		
	}
	
	public static int[] fillWithRandom(int[] arr,int start,int end)
	{
		int[] a = Arrays.copyOf(arr,arr.length );
		int max = 1000000;
		for(int x = start;x<end;x++)
		{
			a[x] = (int)(Math.random() * max);
			
		}
		return a;
	}
	
	public static void printToFile(long[] times,String fileName)
	{
		File file = new File(fileName);
		PrintWriter pw;
		try 
		{
			pw = new PrintWriter(file);
			for(int x =0;x<times.length;x++)
			{
				pw.println(String.format("Array %2d || Elements %4d || Time %10d nanos", x,50 + x*100,times[x]/10));
			}
			System.out.println("File written");
			pw.close();
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
	
	}
	
	public static int sequentialSearch(int find,int len,int arr[])
	{
		for(int x = 0;x<len;x++)
		{
			if(arr[x] == find)
				return x;
		}
		return -1;
	}
	
	public static int binarySearch(int[] array,int first,int last,int find)
	{
		if(last>=first)
		{
			int mid = ((last-first)/2) + first;
			
			if(array[mid]==find)
			{
				return find;
			}
			else if(array[mid]>find)
			{
				return binarySearch(array,first,mid-1,find);
			}
			else if(array[mid]<find)
			{
				return binarySearch(array,mid+1,last,find);
			}
			
		}
		return -1;
		
	}
	
	

}
