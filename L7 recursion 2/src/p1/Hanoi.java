package p1;

public class Hanoi {
	private int numDiscs;
	
	
	
	public Hanoi(int numDiscs)
	{
		this.numDiscs = numDiscs;
		moveDiscs(numDiscs,1,3,2);
	}
	
	private void moveDiscs(int num,int fromPeg,int toPeg, int tempPeg)
	{
		if(num>0)
		{
			moveDiscs(num-1,fromPeg,tempPeg,toPeg);
			System.out.println("From " + fromPeg + " to " + toPeg);
			moveDiscs(num-1,tempPeg,toPeg,fromPeg);
		}
	}
	
	
}
