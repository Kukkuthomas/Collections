package map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class LinkedHashMapReader 
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		LinkedHashMap<String,Integer> lhmap=new LinkedHashMap<String,Integer>();  
		int i;
		String name;
		int age;
		int n=Integer.parseInt(br.readLine());
		for(i=0;i<n;i++)
		{
			name=br.readLine();
			age=Integer.parseInt(br.readLine());
			lhmap.put(name,age);
		}
		System.out.println(lhmap);
		System.out.println("Enter the index to be removed:");
		String name1=br.readLine();
		lhmap.remove(name1);
		System.out.println(lhmap);
		System.out.print("Length : ");
		int length=lhmap.size();
		System.out.println(length);
		
	}
}
