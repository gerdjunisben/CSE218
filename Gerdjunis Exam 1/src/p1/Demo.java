package p1;

public class Demo {

	public static void main(String[] args) {
		StudentQueue q = new StudentQueue(10);
		q.insert(new Student("A",3.5,"CSE"));
		q.insert(new Student("B",3.7,"ENG"));
		q.insert(new Student("C",3.5,"PHY"));
		q.insert(new Student("D",3.6,"PSY"));
		q.insert(new Student("E",3.5,"ENG"));
		q.insert(new Student("F",4.0,"CSE"));
		
		while(!q.isEmpty())
		{
			System.out.println(q.remove());
		}

	}

}
