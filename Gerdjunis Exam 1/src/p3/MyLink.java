package p3;

import java.util.LinkedList;

public class MyLink {
	private LinkedList<String> list;
	private String str;
	
	public MyLink(String str)
	{
		this.str = str;
		list = new LinkedList<>();
	}
	
	public void addLink(String str)
	{
		list.add(str);
	}
	
	
	public String getRandom()
	{
		int size = list.size();
		int random = (int)(Math.random() * (size));
		return list.get(random);
	
	}
	
	public String getStr()
	{
		return str;
	}
	
}
