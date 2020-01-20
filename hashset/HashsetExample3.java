package hashset;

import java.util.HashSet;
import java.util.Set;

public class HashsetExample3 
{
	public static void main(String args[])
	{
		Set<String> set1=new HashSet<String>();
		//set1.add("Burger");
		if(set1.isEmpty())
		{
			System.out.println("Set is empty");
		}
		set1.add("Pizza");
		if(set1.contains("Pizza"))
		{
			System.out.println("Present");
		}
		System.out.println("Size of the string : "+set1.size());
	}
}
