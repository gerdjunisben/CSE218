package p5;

public class Demo {
	public static void main(String[] args)
	{
		PQueue queue = new PQueue();
		
		Student s1 = new Student(1.0,"A");
		Student s2 = new Student(3.0,"A");
		Student s3 = new Student(4.0,"B");
		
		queue.insert(s1);
		queue.insert(s2);
		queue.insert(s3);
		
		while(!queue.isEmpty())
		{
			System.out.println(queue.remove());
		}
	}
	
}
