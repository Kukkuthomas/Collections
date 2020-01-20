package map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class TreeMMapBuffered 
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int i;
		String name;
		int age;
		int n=Integer.parseInt(br.readLine());
		Map<String,Integer> map=new TreeMap<String,Integer>();
		for(i=0;i<n;i++)
		{
			name=br.readLine();
			age=Integer.parseInt(br.readLine());
			map.put(name,age);
		}
		System.out.println("Enter the number of values to be inserted in map2"+map);
		System.out.println("Enter the index to be removed:");
		String name1=br.readLine();
		map.remove(name1);
		System.out.println(map);
		System.out.print("Enter the index to insert:");
		String name2=br.readLine();
		System.out.print("Enter the value to be inserted:");
		int n1=Integer.parseInt(br.readLine());
		map.put(name2,n1);
		br.close();
		System.out.println(map);	
	}
}
