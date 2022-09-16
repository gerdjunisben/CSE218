package p4;

public class ListIterator {
	private Link current,previous;
	private LinkList ourList;
	
	public ListIterator(LinkList list)
	{
		ourList = list;
		reset();
	}
	
	public void reset()
	{
		current = ourList.getFirst();
		previous = null;
	}
	
	public boolean atEnd()
	{
		return current.next == null;
	}
	
	public void nextLink()
	{
		previous = current;
		current = current.next;
			
	}
	
	public Link getCurrent()
	{
		return current;
	}
	
	public void insetBefore(long dData)
	{
		Link newLink = new Link(dData);
		if(previous == null)
		{
			newLink.next = ourList.getFirst();
			ourList.setFirst(newLink);
			reset();
		}
		else
		{
			newLink.next = previous.next;
			previous.next = newLink;
			current = newLink;
		}
	}
	
	public double deleteCurrent()
	{
		double value = current.dData;
		if(previous == null)
		{
			ourList.setFirst(current);
			reset();
		}
		else
		{
			previous.next = current.next;
			if(atEnd())
				reset();
			else
				current = current.next;
		}
		return value;
	}
	
	public void insertAfter(double dData)
	{
		Link newLink = new Link(dData);
		if(ourList.isEmpty())
		{
			ourList.setFirst(newLink);
			current = newLink;
		}
		else
		{
			newLink.next = current.next;
			current.next = newLink;
			nextLink();
		}
	}
	
	
}
