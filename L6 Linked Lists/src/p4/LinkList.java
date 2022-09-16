package p4;


public class LinkList {
	private Link first;
	
	
	public LinkList()
	{
		first = null; 
	}
	
	public ListIterator getIterator()
	{
		return new ListIterator(this);
	}
	
	
	
	public boolean isEmpty()
	{
		return first==null;
	}
	
	public Link getFirst()
	{
		return first;
	}
	
	public void setFirst(Link link)
	{
		this.first = link;
	}
	
	public void display()
	{
		Link current = first;
		
		while(current != null)
		{
			current.displayLink();
			current = current.next;
		}
	}
}
