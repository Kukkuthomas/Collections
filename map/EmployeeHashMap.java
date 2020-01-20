package map;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

class Employee1  
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
}
public class EmployeeHashMap 
{
	public static void main(String args[])
	{
		int i;
		String name;
		int age;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Map<Integer,Employee1> map=new TreeMap<Integer,Employee1>();
		Employee1[] emp=new Employee1[n];
		for(i=0;i<n;i++)
		{
			name=sc.next();
			age=sc.nextInt();
			emp[i]=new Employee1();
			emp[i].setAge(age);
			emp[i].setName(name);
			map.put(i,emp[i]);
		}
		for(Map.Entry<Integer,Employee1> k : map.entrySet())
		{
			Employee1 e1=k.getValue();
			System.out.println(e1.getName()+" "+e1.getAge());
		}
		sc.close();
	}
}
