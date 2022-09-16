package p3;

public class Link {
	public double dData;
	public Link next;
	public Link previous;
	
	
	public Link(double dData) {
		super();
		this.dData = dData;
		next = null;
		previous = null;
		}
	
	
	
	public void displayLink()
	{
		System.out.println("{dData" + dData + "}");
	}
}
