package p1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class Demo2 {
	public static void main(String[] args)
	{
		File file = new File("script");
		try
		{
			StringBuffer sb = new StringBuffer();
			FileReader r = new FileReader(file);
			BufferedReader br = new BufferedReader(r);
			String s= br.readLine();
			int count = 0;
			while(s != null)
			{
				s = s.strip();
				if(count%10 == 0 && count!=0)
					sb.append(s + "\n");
				else
					sb.append(s + " ");
				s= br.readLine();
				count ++;
			}
			br.close();
			r.close();
			
			PrintWriter pw = new PrintWriter("data2");
			pw.println(sb.toString());
			pw.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
