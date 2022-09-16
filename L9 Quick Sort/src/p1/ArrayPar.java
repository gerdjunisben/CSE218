package p1;

public class ArrayPar {
	private long[] arr;
	private int nElems;
	
	public ArrayPar(int maxSize)
	{
		nElems = 0;
		arr = new long[maxSize];
	}
	
	public void insert(long value)
	{
		arr[nElems++] = value;
	}
	
	public void display()
	{
		for(int x = 0;x<nElems;x++)
		{
			System.out.print(arr[x]);
		}
		System.out.println();
	}
	
	public int partitionIt(int left,int right,long pivot)
	{
		int leftPtr = -1;
		int rightPtr = right +1;
		
		while(true)
		{
			while(leftPtr < right && arr[++leftPtr] < pivot)
			{
				;
			}
			
			while(rightPtr>left && arr[--rightPtr] >= pivot)
			{
				;
			}
			
			if(leftPtr>= rightPtr)
			{
				break;
			}
			else
			{
				swap(leftPtr,rightPtr);
			}
		}
		
		return leftPtr;
	}
	
	public void swap(int i1,int i2)
	{
		long temp = arr[i1];
		arr[i1] = arr[i2];
		arr[i2] = temp;
	}
	
	public int size()
	{
		return nElems;
	}
}
