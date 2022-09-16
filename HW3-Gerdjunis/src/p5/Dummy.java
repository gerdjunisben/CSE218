package p5;

public class Dummy implements Comparable<Dummy>{
	private String name;
	private int number;
	
	public Dummy(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Dummy [name=" + name + ", number=" + number + "]";
	}
	@Override
	public int compareTo(Dummy o) {
		// TODO Auto-generated method stub
		return o.getName().compareTo(this.name);
	}
	
	
	
}
