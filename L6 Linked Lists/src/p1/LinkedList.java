package p1;

public class LinkedList {
	private Link first;
	
	
	public LinkedList()
	{
		first = null; //default but makes it clear that it is null
	}
	
	public Link find(int key)
	{
		Link current = first;
		while(current!=null)
		{
			if(current.getiData()==key)
				break;
			current = current.getNext();
		}
		return current;
	}
	
	public Link delete(int key)
	{
		Link current = first;
		Link previous = first;
		while(current!=null)
		{
			if(current.getiData()==key)
				break;
			previous = current;
			current = current.getNext();
		}
		if(current == null)
			return current;
		else if(first == current)
		{
			first = null;
			return current;
		}
		else
		{
			previous.setNext(current.getNext());
			return current;
		}
		
		
	}
	
	public boolean isEmpty()
	{
		return first==null;
	}
	
	public void insertFirst(int iData,double dData)
	{
		Link newLink = new Link(iData, dData);
		newLink.setNext(first);
		first = newLink;
	}
	
	public Link deleteFirst()
	{
		Link temp = first;
		
		first = first.getNext();
		
		
		return temp;
	}
	
	public void displayList()
	{
		Link current = first;
		while(current!=null)
		{
			current.displayLink();
			current = current.getNext();
		}
		
	}
}
