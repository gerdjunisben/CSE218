package p2;

public class StringBag {
	private int size;
	private String[] array;
	private int nElems;
	
	public StringBag(int size) {
		super();
		this.size = size;
		array = new String[size];
		nElems = 0;
		
	}
	
	public void insert(String value)
	{
		if(nElems<size)
		{
			array[nElems++] = value;
		}
		else
		{
			System.out.println("BAG FULL");
		}
	}
	
	public void display()
	{
		recurDisplay(0);
	}
	
	public void recurDisplay(int index)
	{
		//"display all the objects in an array from the first index to the last."
		if(index!=size)
		{
			System.out.print(array[index] + ", ");
			recurDisplay(index+1);
		}
		else
		{
			System.out.println();
		}
	}
	
	
}
