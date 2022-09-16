package p1;

public class Demo {

	public static void main(String[] args) {
		LinkedLinkedLists list = new LinkedLinkedLists();
		list.readFile("data2");
		String s = list.generate(100);
		System.out.println(s);
	}

}
