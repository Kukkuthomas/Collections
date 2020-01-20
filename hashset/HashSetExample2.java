package hashset;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
public class HashSetExample2 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		LinkedList<Integer> list1=new LinkedList<Integer>();
		
		for(int i=0;i<n;i++)
		{
			list1.add(s.nextInt());
		}
		System.out.println("List : "+list1);
		Set<Integer> set1=new HashSet<Integer>();
		int n1=s.nextInt();
		for(int i=0;i<n1;i++)
		{
			set1.add(s.nextInt());
		}
		System.out.println("HashSet : "+set1);
		set1.addAll(list1);
		System.out.println("Copying : "+set1);
	}
}
