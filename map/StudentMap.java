package map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Map;

public class StudentMap 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		Map<Integer, String> map=new TreeMap<Integer,String>();
		map.put(1, "Amit");
		map.put(5,"Rahul");
		map.put(3,"Nithin");
		for(Map.Entry k:map.entrySet())
		System.out.println(k.getValue()+"."+k.getKey());
	}
}
