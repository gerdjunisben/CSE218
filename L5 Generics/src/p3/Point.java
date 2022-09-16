package p3;

//java see's <> as a place holder
//T stands for type while E stands for elements
//it can be any letter but try to keep them single and capital
//upper bound constraint
//specify a super class and all that extend are allowed
//for this you may want to use the super class Number (abstract class by choice not neccesity)
//extends works on interfaces too when referring to generics
public class Point <T extends Comparable,S extends Comparable>{
	private T x;
	private S y;

	public Point(T x, S y) {
		super();
		this.x = x;
		this.y = y;
	}

	public T getX() {
		return x;
	}

	public void setX(T x) {
		this.x = x;
	}

	public S getY() {
		return y;
	}

	public void setY(S y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	

	
	
}
