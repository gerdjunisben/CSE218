package p3;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[] arr = {100,6,7,23,64,1,23,53,75};
		System.out.println(maxElement(arr,0,0));
	}

	public static long maxElement(long[] arr,int index,long max)
	{
		if(index == arr.length)
		{
			return max;
		}
		else
		{
			if(arr[index] >max)
				max = arr[index];
			return maxElement(arr,index+1,max);
		}
	}
}
