package p3;

public class StudentQueue {
	private Student[] queue;
	private int maxSize,nElems;
	
	public StudentQueue(int maxSize)
	{
		this.maxSize = maxSize;
		nElems = 0;
		queue = new Student[maxSize];
	}
	
	public boolean isEmpty()
	{
		return nElems==0;
	}
	
	public boolean isFull()
	{
		return nElems == maxSize;
	}
	
	
	public void insert(Student value)
	{
		if(!isFull())
		{
			int index;
			for(index = nElems-1;index>=0;index--)
			{
				if(queue[index].compareTo(value)>0)
				{
					queue[index+1] = queue[index];
				}
				else
				{
					break;
				}
			}
			queue[index+1] = value;
			nElems++;
		}
	}
	
	public Student remove()
	{
		if(!isEmpty())
			return queue[--nElems];
		else
			return null;
	}
	
	
}
