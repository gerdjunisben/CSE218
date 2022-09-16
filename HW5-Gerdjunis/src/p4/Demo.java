package p4;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(palindromeDetector("ham",0,2));
		System.out.println(palindromeDetector("tacocat",0,6));
	}
	
	public static boolean palindromeDetector(String str,int front,int back)
	{
		if(front == back)
		{
			return true;
		}
		else
		{
			if(str.charAt(front) != str.charAt(back))
				return false;
			else
				return palindromeDetector(str,front+1,back-1);
		}
	}

}
