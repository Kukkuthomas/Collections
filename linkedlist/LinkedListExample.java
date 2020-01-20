package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample 
{
	public static void main(String args[])
	{
		 LinkedList<String> object = new LinkedList<String>();   
	     // Adding elements to the linked list 
	     object.add("Competition"); 
	     object.add("Be positive"); 
	     object.addLast("Happy Day");
	     Iterator it=object.iterator();
	     while(it.hasNext())
	     {
	        System.out.println(it.next());
	     }
	}
}
