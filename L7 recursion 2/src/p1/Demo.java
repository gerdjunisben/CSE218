package p1;

public class Demo {

	public static void main(String[] args) 
	{
		System.out.println(sumFraction(5));

	}
	
	public static double sumFraction(int num)
	{
		if(num == 1)
			return 1.0;
		return sumFraction(num-1) + (1.0/num);
		
	}

}
