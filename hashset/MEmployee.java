package hashset;
import java.util.Scanner;
import java.util.TreeSet;
public class MEmployee 
{
	public static void main(String args[])
	{
		int i;
		String name;
		int age;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		TreeSet<Employee> hashset=new TreeSet<Employee>();
		Employee[] emp=new Employee[n];
		for(i=0;i<n;i++)
		{
			name=sc.next();
			age=sc.nextInt();
			emp[i]=new Employee();
			emp[i].setAge(age);
			emp[i].setName(name);
			hashset.add(emp[i]);
		}
		for(Employee e : hashset)
			System.out.println(e.getName()+" "+e.getAge());
		sc.close();
	}
}
