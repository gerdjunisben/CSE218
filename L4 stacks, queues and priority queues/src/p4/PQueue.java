package p4;

public class PQueue 
{
	private Student queueArray[];
	private int nElems;
	private int maxSize;
	
	public PQueue(int maxSize)
	{
		this.maxSize = maxSize;
		nElems = 0;
		queueArray = new Student[maxSize];
	}
	
	public boolean isEmpty()
	{
		return nElems == 0;
	}
	
	public boolean isFull()
	{
		return nElems == maxSize;
	}
	
	public Student peekMin()
	{
		return queueArray[nElems-1];
	}
	
	public void insert(Student value)
	{
		if(!isFull())
		{
			int index;
			for(index = nElems-1;index>=0;index--)
			{
				if(queueArray[index].compareTo(value)<0)
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
	
	public Student remove()
	{
		if(!isEmpty())
			return queueArray[--nElems];
		else
			return null;
	}
}
