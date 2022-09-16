package p1;

public class Demo {

	int[] arr;
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8};
		System.out.println(isMember(arr,3,0));
	}
	
	public static boolean isMember(int[] arr, int value,int index)
	{
		if(index == arr.length)
		{
			return false;
		}
		else if(arr[index] == value)
		{
			return true;
		}
		else
		{
			return isMember(arr,value,index+1);
		}
	}

}
