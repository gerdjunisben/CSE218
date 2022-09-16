package p1;

public class Demo {

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		
		stack.push(0);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		while(!stack.isEmpty())
		{
			System.out.println(stack.pop());
		}
		
		MyQueue queue = new MyQueue();
		
		queue.add(0);
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		
		while(!queue.isEmpty())
		{
			System.out.println(queue.remove());
		}
		
		MyPriorityQueue prioQueue = new MyPriorityQueue();
		
		prioQueue.add(1000);
		prioQueue.add(10);
		prioQueue.add(0);
		prioQueue.add(30);
		prioQueue.add(23);
		
		while(!prioQueue.isEmpty())
		{
			System.out.println(prioQueue.remove());
		}

	}

}
