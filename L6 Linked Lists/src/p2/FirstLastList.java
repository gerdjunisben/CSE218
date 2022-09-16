package p2;

public class FirstLastList {
	private Link first,last;
	
	public FirstLastList()
	{
		first = null;
		last = null;
	}
	
	public boolean isEmpty()
	{
		return first == null;
	}
	
	public void displayList()
	{
		Link current = first;
		while(first!=null)
		{
			current.displayLink();
			current = current.next;
		}
		System.out.println();
	}
	
	public void insertFirst(double dData)
	{
		Link newLink = new Link(dData);
		if(isEmpty())
		{
			last = newLink;
		}
		newLink.next = first;
		first = newLink;
	}
	
	public void insertLast(double dData)
	{
		Link newLink = new Link(dData);
		if(isEmpty())
		{
			first = newLink;
		}
		else
		{
			last.next = newLink;
		}
		last = newLink;
	}
	
	public double deleteFirst()
	{
		double temp = first.dData;
		if(first.next==null)
		{
			last = null;
		}
		first = first.next;
		return temp;
	}
	
}
