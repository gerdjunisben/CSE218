package p1;

public class ArrayIns {
	private long[] arr;
	private int nElems;
	
	public ArrayIns(int maxSize)
	{
		arr = new long[maxSize];
		nElems = 0;
	}
	
	public void insert(long value)
	{
		arr[nElems++] = value;
	}
	
	public void display()
	{
		for(int x =0;x<nElems;x++)
		{
			System.out.print(arr[x] + " ");
		}
		System.out.println();
	}
	
	public int size()
	{
		return nElems;
	}
	
	public void quickSort()
	{
		recQuickSort(0,nElems-1);
	}

	private void recQuickSort(int left, int right) {
		if(right - left <= 0)
		{
			return;
		}
		else
		{
			long pivot = arr[right];
			int partition =  partitionIt(left,right,pivot);
			recQuickSort(left,partition-1);
			recQuickSort(partition+1,right);
		}
	}

	private int partitionIt(int left, int right, long pivot) {
		int leftPtr = left-1;
		int rightPtr = right-1;
		
		while(true)
		{
			while(leftPtr< right && arr[++leftPtr] < pivot)
			{
				;
			}
			while(rightPtr> left && arr[--rightPtr] >= pivot)
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
		
		swap(leftPtr,right);
		return leftPtr;
		
	}

	private void swap(int i1, int i2) {
		long temp = arr[i1];
		arr[i1] = arr[i2];
		arr[i2] = temp;
	}
}
