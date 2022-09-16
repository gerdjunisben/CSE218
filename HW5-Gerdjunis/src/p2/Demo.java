package p2;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse("ben");
		reverse("benjamin");
	}

	public static void reverse(String str)
	{
		int index = 0;
		if(index ==str.length())
		{
			return;
		}
		else
		{
			reverse(str,index+1);
			System.out.print(str.charAt(index));
		}
		System.out.println();
	}
	
	public static void reverse(String str,int index)
	{
		if(index ==str.length())
		{
			return;
		}
		else
		{
			reverse(str,index+1);
			System.out.print(str.charAt(index));
		}
	}
}
