package p3;

public class PQueue 
{
	private long queueArray[];
	private int nElems;
	private int maxSize;
	
	public PQueue(int maxSize)
	{
		this.maxSize = maxSize;
		nElems = 0;
		queueArray = new long[maxSize];
	}
	
	public boolean isEmpty()
	{
		return nElems == 0;
	}
	
	public boolean isFull()
	{
		return nElems == maxSize;
	}
	
	public long peekMin()
	{
		return queueArray[nElems-1];
	}
	
	public void insert(long value)
	{
		if(!isFull())
		{
			int index;
			for(index = nElems-1;index>=0;index--)
			{
				if(queueArray[index]<value)
				{
					queueArray[index+1] = queueArray[index];
				}
				else
				{
					break;
				}
			}
			queueArray[index+1] = value;
			nElems++;
		}
	}
	
	public long remove()
	{
		if(!isEmpty())
			return queueArray[--nElems];
		else
			return 0;
	}
}
