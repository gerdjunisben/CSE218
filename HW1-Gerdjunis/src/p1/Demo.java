package p1;

import java.util.Arrays;
import java.io.*;

public class Demo {

	public static void main(String[] args) throws FileNotFoundException 
	{
		int[][] arrays = new int[20][1000];
		int accum = 50;
		int[] randomNums = new int[1000];
		long[][] durations = new long[2][20];
		int max = 1000000;
		
		for(int x = 0;x<arrays.length;x++)
		{
			randomNums[x] = (int)(Math.random() * max);
		}
		
		for(int x = 0;x<arrays.length;x++)
		{
			for(int y = 0;y<accum;y++)
			{
				arrays[x][y] =randomNums[y];
			}
			accum+=50;
		}
		
		// Sequential search
		for(int x = 0;x<arrays.length;x++)
		{
			long startTime = System.nanoTime();
			sequentialSearch(arrays,x,randomNums[0]);
			sequentialSearch(arrays,x,randomNums[6]);
			sequentialSearch(arrays,x,randomNums[49]);
			sequentialSearch(arrays,x,randomNums[30+(x*50)]);
			sequentialSearch(arrays,x,randomNums[21+(x*50)]);
			sequentialSearch(arrays,x,randomNums[29+(x*50)]);
			sequentialSearch(arrays,x,randomNums[40+(x*50)]);
			sequentialSearch(arrays,x,randomNums[20+(x*50)]);
			sequentialSearch(arrays,x,randomNums[3+(x*50)]);
			sequentialSearch(arrays,x,randomNums[37+(x*50)]);
			sequentialSearch(arrays,x,randomNums[47+(x*50)]);
			sequentialSearch(arrays,x,randomNums[23+(x*50)]);
			sequentialSearch(arrays,x,randomNums[1+(x*50)]);
			sequentialSearch(arrays,x,randomNums[10+(x*50)]);
			sequentialSearch(arrays,x,randomNums[8+(x*50)]);
			sequentialSearch(arrays,x,randomNums[27+(x*50)]);
			sequentialSearch(arrays,x,randomNums[12+(x*50)]);
			sequentialSearch(arrays,x,randomNums[13+(x*50)]);
			sequentialSearch(arrays,x,randomNums[14+(x*50)]);
			sequentialSearch(arrays,x,randomNums[15+(x*50)]);
			long endTime = System.nanoTime();
			long duration = endTime-startTime; 
			durations[0][x] = duration/20;
		}
		
		
		for(int x =0;x<arrays.length;x++)
		{
			Arrays.sort(arrays[x]);
		}
		
		for(int x = 0;x<arrays.length;x++)
		{
			long startTime = System.nanoTime();
			binarySearch(arrays[x],0,(x+1)*50,randomNums[0]);
			binarySearch(arrays[x],0,(x+1)*50,randomNums[6]);
			binarySearch(arrays[x],0,(x+1)*50,randomNums[49]);
			binarySearch(arrays[x],0,(x+1)*50,randomNums[30+(x*50)]);
			binarySearch(arrays[x],0,(x+1)*50,randomNums[21+(x*50)]);
			binarySearch(arrays[x],0,(x+1)*50,randomNums[29+(x*50)]);
			binarySearch(arrays[x],0,(x+1)*50,randomNums[40+(x*50)]);
			binarySearch(arrays[x],0,(x+1)*50,randomNums[20+(x*50)]);
			binarySearch(arrays[x],0,(x+1)*50,randomNums[3+(x*50)]);
			binarySearch(arrays[x],0,(x+1)*50,randomNums[37+(x*50)]);
			binarySearch(arrays[x],0,(x+1)*50,randomNums[47+(x*50)]);
			binarySearch(arrays[x],0,(x+1)*50,randomNums[23+(x*50)]);
			binarySearch(arrays[x],0,(x+1)*50,randomNums[1+(x*50)]);
			binarySearch(arrays[x],0,(x+1)*50,randomNums[10+(x*50)]);
			binarySearch(arrays[x],0,(x+1)*50,randomNums[8+(x*50)]);
			binarySearch(arrays[x],0,(x+1)*50,randomNums[27+(x*50)]);
			binarySearch(arrays[x],0,(x+1)*50,randomNums[12+(x*50)]);
			binarySearch(arrays[x],0,(x+1)*50,randomNums[13+(x*50)]);
			binarySearch(arrays[x],0,(x+1)*50,randomNums[14+(x*50)]);
			binarySearch(arrays[x],0,(x+1)*50,randomNums[15+(x*50)]);
			long endTime = System.nanoTime();
			long duration = endTime-startTime; 
			durations[1][x] = duration/20;
		}

		File file = new File("Data");
		PrintWriter pw = new PrintWriter(file);
		
		for(int x =0;x<durations[0].length;x++)
		{
			pw.println(String.format("Elements : %4d, Sequential Time (nanos) : %6d , Binary Time (nanos) : %6d" ,((x+ 1)* 50),durations[0][x],durations[1][x]));
		}
		System.out.println("Done");
		pw.close();
	}
	
	public static int sequentialSearch(int[][] array,int arrayNumber,int find)
	{
		for(int i=0;i<(arrayNumber+1)*50;i++)
		{
			if(array[arrayNumber][i]==find)
			{
				//doesn't matter what is returned because it is just checking time
				return array[arrayNumber][i];
			}
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
