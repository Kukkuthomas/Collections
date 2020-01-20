package comparator;
import java.awt.List;
import java.util.Collections;

import java.util.LinkedList;
import java.util.Scanner;

//import comparable.Employee;


class Employee  implements Comparable<Employee>
{
		private String emp_name;
		private int age;
		
		public String getName()
		{
			return emp_name=emp_name;
		}
		public void setName(String emp_name)
		{
			this.emp_name=emp_name;
		}
		public int getAge()
		{
			return age;
		}
		public void setAge(int age)
		{
			this.age=age;
		}
		public int CompareTo(Employee  e)
		{
			if(age>e.getAge())
			{
				return 1;
			}
			else if(age<e.getAge())
			{
				return -1;
			}
			else
			{
				return 0;
			}
		}
		@Override
		public int compareTo(Employee o) 
		{
			// TODO Auto-generated method stub
			return 1;
		}

}


public class ComparatorExample 
{
		public static void main(String args[])
		{
			int i;
			String name;
			int age;
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			LinkedList<Employee> list=new LinkedList<Employee>();
			Employee[] emp=new Employee[n];
			for(i=0;i<n;i++)
			{
				name=sc.next();
				age=sc.nextInt();
				emp[i]=new Employee();
				emp[i].setAge(age);
				emp[i].setName(name);
				list.add(i,emp[i]);
			}
			System.out.println("Name Wise Comparison");
			Collections.sort(list, new NameComparator());
			for(Employee e: list)
				System.out.println(e.getName()+e.getAge());
			System.out.println("Age Wise Comparison");
			Collections.sort(list, new AgeComparator());
			for(Employee e:list)
				System.out.println(e.getName()+e.getAge());
			sc.close();
	}

}
