package p2;

public class Demo 
{

	public static void main(String[] args) 
	{
		StudentBag bag = new StudentBag(1000);
		bag.fill(1000);
		bag.displayStudents();
		bag.bubbleSort();
		bag.insertionSort();
		bag.insert(new Student("Abcde",3.5,34));
		bag.selectionSort();
		bag.displayStudents();
		int index = bag.binarySearch("Abcde");
		System.out.println(index);
		index = bag.sequentialSearch("Abcde");
		
		Student[] students = bag.get20Students();
		
		double start = System.nanoTime();
		index = bag.binarySearch(students[19].getName());
		System.out.println(System.nanoTime()-start);
		start = System.nanoTime();
		index = bag.sequentialSearch(students[19].getName());
		System.out.println(System.nanoTime()-start);
	}
}
