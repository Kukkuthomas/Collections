package comparable;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

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



public class LinkedHashMapCompare 
{
	public static void main(String args[])
	{
		int i;
		String name;
		int age;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Map<Integer,Employee> lhmap=new HashMap<Integer,Employee>();
		Employee[] emp=new Employee[n];
		for(i=0;i<n;i++)
		{
			name=sc.next();
			age=sc.nextInt();
			emp[i]=new Employee();
			emp[i].setAge(age);
			emp[i].setName(name);
			lhmap.put(i,emp[i]);
		}
		for(Map.Entry<Integer,Employee> e : lhmap.entrySet())
		{
			Employee c=e.getValue();
			System.out.println(e.getKey()+" "+c.getName()+" "+c.getAge());
		
		}
		sc.close();
	}
}
