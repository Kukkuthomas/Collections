package linkedlist;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedArrayList 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		LinkedList<String> object = new LinkedList<String>();
		ArrayList<String> obj=new ArrayList<String>();
		for(int i=0;i<n;i++)
		{
			object.add(s.next());
		}
		int n1=s.nextInt();
		for(int i=0;i<n1;i++)
		{
			obj.add(s.next());
		}
		System.out.println("Actual LinkedList:"+object);
		object.addAll(obj);
		System.out.println("After Copy:"+object);
		
	}
}
