package p2;

public class Queue 
{
	private long[] queueArray;
	private int front,rear,maxSize,nElems;
	
	public Queue(int maxSize)
	{
		this.maxSize = maxSize;
		queueArray = new long[maxSize];
		front = 0;
		rear = -1;
		nElems = 0;
	}
	
	public boolean isEmpty()
	{
		return nElems==0;
	}
	
	public boolean isFull()
	{
		return nElems == maxSize;
	}
	
	public void add(long value)
	{
		if(rear==maxSize-1 && !isFull())
		{
			rear = -1;
		}
		
		queueArray[++rear] = value;
		
		nElems++;
	}
	
	public long remove()
	{
		long temp = queueArray[front++];
		
		if(front==maxSize && !isEmpty())
		{
			front = 0;
		}
		nElems--;
		
		return temp;
	}
	
	public void showEnd()
	{
		System.out.println(queueArray[rear]);
	}
}
