package p5;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[] = {'a','a','a','a','a','a','a','a'};
		System.out.println(charCounter(arr,'a',0,0));
	}
	
	public static int charCounter(char[] arr,char c,int count,int i)
	{
		if(i == arr.length)
		{
			return count;
		}
		else
		{
			if(arr[i]==c)
				count++;
			return(charCounter(arr,c,count,i+1));
		}
	}
}
