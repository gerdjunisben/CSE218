package p3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.LinkedList;

public class LinkedLinkedLists {
	private LinkedList<MyLink> list;
	private int previous;
	
	public LinkedLinkedLists()
	{
		list  = new LinkedList<>();
		previous = 0;
	}
	
	private void addLink(String str)
	{
		if(list.size()> 0)
		{

			
			list.get(previous).addLink(str);
			int newIndex = search(str);
			if(newIndex == -1)
			{
				list.add(new MyLink(str));
				previous=list.size()-1;
				
			}
			else
			{
				previous= newIndex;
			}
			
		}
		else
		{
			list.add(new MyLink(str));
			previous = 0;
		}
		
	}
	
	private int search(String str)
	{
		for(int x = 0;x<list.size();x++)
		{
			if(list.get(x).getStr().equals(str))
			{
				return x;
			}
		}
		return -1;
	}
	
	public String generate(int size,String word)
	{
		StringBuffer sb = new StringBuffer();
		int index = search(word);
		String str;
		sb.append(word + " ");
		for(int x = 0;x<size-1;x++)
		{
			if(index!= list.size())
				str = list.get(index).getRandom();
			else
				str = list.get(0).getRandom();
			sb.append(str + " ");
			if(x%10 == 0 && x!=0)
				sb.append("\n");
			index = search(str);
		}
		
		return sb.toString();
	}
	
	public void readFile(File inputFile)
	{
		try
		{
			FileReader r = new FileReader(inputFile);
			BufferedReader br = new BufferedReader(r);
			String s= br.readLine();
			while(s != null)
			{
				String[] split = s.split(" ");
				for(int i = 0;i<split.length;i++)
				{
					addLink(split[i]);
				}
				s = br.readLine();
			}
			br.close();
			r.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
