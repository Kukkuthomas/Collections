package hashset;

public class Employee  implements Comparable<Employee>
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
		@Override
		public int compareTo(Employee o) 
		{
			// TODO Auto-generated method stub
			return 1;
		}

}
