package p1;

public class Demo {

	public static void main(String[] args) {
		ArrayPar arr = new ArrayPar(10);
		
		arr.insert(5);
		arr.insert(6);
		arr.insert(9);
		arr.insert(1);
		arr.insert(0);
		arr.insert(4);
		arr.insert(8);
		arr.insert(3);
		arr.insert(7);
		arr.insert(2);
		
		arr.display();
		
		int par = arr.partitionIt(0, arr.size()-1, 5);
		
		arr.display();
		
		System.out.println("Partition: " + par);
	}

}
