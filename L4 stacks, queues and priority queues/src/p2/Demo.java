package p2;

public class Demo {

	public static void main(String[] args) 
	{
		Queue queue = new Queue(4);
		
		while(!queue.isFull())
		{
			queue.add((long)(Math.random()*400));
			queue.showEnd();
		}
		
		System.out.println();
		
		while(!queue.isEmpty())
		{
			System.out.println(queue.remove());
		}
		
		System.out.println();
		
		while(!queue.isFull())
		{
			queue.add((long)(Math.random()*400));
			queue.showEnd();
		}
		
		System.out.println();
		
		while(!queue.isEmpty())
		{
			System.out.println(queue.remove());
		}

	}

}
