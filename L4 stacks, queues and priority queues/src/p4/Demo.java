package p4;

public class Demo {

	public static void main(String[] args) 
	{
		PQueue pq = new PQueue(10);
		
		pq.insert(new Student(4.0,"C"));
		pq.insert(new Student(3.5,"V"));
		pq.insert(new Student(2.5,"B"));
		pq.insert(new Student(1.5,"R"));
		pq.insert(new Student(4.0,"A"));
		
		while(!pq.isEmpty())
		{
			System.out.println(pq.remove());
		}

	}

}
