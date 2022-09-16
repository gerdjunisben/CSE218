package p1;

public class Demo {

	public static void main(String[] args) 
	{
		StudentBag bag = new StudentBag(1000);
		for(int x =0;x<10;x++)
		{
			bag.fill(100);
		}
		
		
		String[] names = bag.get20Names();
		long time = 0;
		for(String name:names)
		{
			time += bag.searchByName(name);
		}
		
		System.out.println(time/20);
		
		long time2 = 0;
		for(String name:names)
		{
			time2 +=bag.binarySearchByName(name);
		}
		
		System.out.println(time2/20);
	}

}
