package p1;

import java.util.HashSet;

public class Demo {

	public static void main(String[] args) {
		HashSet<String> wordSet = new HashSet<>(10000);
		wordSet.add("A");
		wordSet.add("At");
		wordSet.add("And");
		wordSet.add("Ben");
		wordSet.add("Benjamin");
		System.out.println(wordSet.toString());
		//HashMap has a unique key
	}

}
