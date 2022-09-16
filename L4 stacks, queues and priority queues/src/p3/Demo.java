package p3;

public class Demo {

	public static void main(String[] args) 
	{
		PQueue pq = new PQueue(10);
		
		pq.insert(50);
		pq.insert(5);
		pq.insert(20);
		pq.insert(30);
		pq.insert(1);
		
		while(!pq.isEmpty())
		{
			System.out.println(pq.remove());
		}

	}

}
