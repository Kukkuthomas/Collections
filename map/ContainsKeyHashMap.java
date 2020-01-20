package map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ContainsKeyHashMap 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		Map<Integer,String> set=new HashMap<Integer,String>();
		set.put(2, "Anu");
		set.put(4,"Manu");
		System.out.println(set.containsKey(5));
		System.out.println(set.containsValue("Anu"));
	}
}
