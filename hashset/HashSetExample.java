package hashset;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class HashSetExample 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		Set<Integer> set1=new HashSet<Integer>();
		Set<Integer> set2=new HashSet<Integer>();
		for(int i=0;i<n;i++)
		{
			set1.add(s.nextInt());
		}
		System.out.println("Set 1 : "+set1);
		int n1=s.nextInt();
		for(int i=0;i<n1;i++)
		{
			set2.add(s.nextInt());
		}
		System.out.println("Set 2 : "+set2);
		Set<Integer> union=new HashSet<Integer>(set1);
		union.addAll(set2);
		System.out.println("Union : "+union);
		Set<Integer> inter=new HashSet<Integer>(set1);
		inter.retainAll(set2);
		System.out.println("Intersection : "+inter);
		Set<Integer> sym=new HashSet<Integer>(set1);
		sym.removeAll(set2);
		System.out.println("Symmetric : "+sym);
	}
}
