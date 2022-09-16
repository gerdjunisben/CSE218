package p1;

public class Demo {

	public static void main(String[] args) {
		MergeSortArray arr = new MergeSortArray(10);
		
		arr.insert(0);
		arr.insert(7);
		arr.insert(2);
		arr.insert(4);
		arr.insert(5);
		arr.insert(6);
		arr.insert(8);
		arr.insert(1);
		arr.insert(9);
		arr.insert(3);
		
		arr.display();
		arr.mergeSort();
		arr.display();

	}

}
