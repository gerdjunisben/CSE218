package p1;

public class MergeSortArray {
	private long[] theArray;
	private int nElems;
	
	public MergeSortArray(int maxSize)
	{
		theArray = new long[maxSize];
	}
	
	public void mergeSort()
	{
		long[] temp = new long[nElems];
		recMergeSort(temp,0,nElems-1);
	}
	
	private void recMergeSort(long[] temp,int lower,int upper)
	{
		if(lower == upper)
		{
			return;
		}
		else
		{
			int mid = (lower +upper)/2;
			recMergeSort(temp,lower,mid);//left half
			recMergeSort(temp,mid +1,upper);//right half
			merge(temp,lower,mid+1,upper);//merge
		}
	}
	
	private void merge(long[] temp, int lowPtr,int highPtr,int upper)
	{
		int j = 0;//temp index
		int lower = lowPtr;
		int mid = highPtr-1;
		int n = upper -lower +1;
		
		while(lowPtr <= mid && highPtr <= upper)
		{
			if(theArray[lowPtr]<theArray[highPtr])
			{
				temp[j++] = theArray[lowPtr++];
			}
			else
			{
				temp[j++] = theArray[highPtr++];
			}
		}
		
		while(lowPtr<= mid)
		{
			temp[j++] = theArray[lowPtr++];
		}
		
		while(highPtr<= upper)
		{
			temp[j++] = theArray[highPtr++];
		}
		
		for(int x = 0;x<n;x++)
		{
			theArray[lower + x] = temp[x];
		}
	}
	
	public void insert(long value)
	{
		theArray[nElems++] = value;
	}
	
	public void display()
	{
		for(int x = 0;x<nElems;x++)
		{
			System.out.print(theArray[x]);
		}
		System.out.println();
	}
}
