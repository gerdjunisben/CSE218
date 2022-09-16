package p1;

public class Demo2 {

	public static void main(String[] args) {
		System.out.println(Long.MAX_VALUE + " - " + Long.MIN_VALUE);
		System.out.println(factorial(23));//17=< makes the number go over the max number 
		//for an integer type
		//you may use big decimal if even long is not large enough
	}
	
	public static long factorial(int num)
	{
		if(num == 1)
			return 1;
		return factorial(num-1) * num;
	}

}
