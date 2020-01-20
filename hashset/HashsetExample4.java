package hashset;
import java.util.Scanner;
import java.lang.Math;
import java.util.Set;
import java.util.HashSet;

public class HashsetExample4 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		Set<Integer> set1=new HashSet<Integer>();
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			set1.add(s.nextInt());
		}
		System.out.println("Numbers : "+set1);
		int rem=s.nextInt();
		set1.remove(rem);
		System.out.println("After remove() : "+set1);
		Set<Integer> set2=new HashSet<Integer>();
		for(int ref: set1)
		{
			int var=ref;
			int num=(int)Math.sqrt(var);
			if(num*num==var)
			{
				set2.add(var);
			}
		}
		set1.removeAll(set2);
		System.out.println("After removeAll()(perfectSquares) : "+set1);
		set1.clear();
		System.out.println("After clear() : "+set1);
	}
}
