package p3;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Point<String,String> p1 = new Point<>("one","two");
		//Point<Name,Student> p1 = new Point<>(new Name("A","A"),new Student("A",4.0));
		Point<Name,Name> p1 = new Point<>(new Name("A","A"),new Name("B","B"));
		Point<Integer,Integer> p2 = new Point<>(1,2);
		//Point<Object,Object> p3 = new Point<>("one",2);
		//Point<Integer,String> p4 = new Point<>(1,"two");
		
		//display(p1);
		display(p2);
		//System.out.println(p3);
		//System.out.println(p4);
		
		//Point.display(p2);
	}
	
	//? means any
	//any data type that Integer extends
	//inclusive
	//a lower bound
	public static void display(Point<? super Integer,? super Integer> point)
	{
		System.out.println(point);
	}
	
	//extends means this class or subclasses of this class (upper bound)
	//super means this class or superclasses of this class (lower bound)
	//you may also use interfaces and abstract classes in the place of normal classes

}
