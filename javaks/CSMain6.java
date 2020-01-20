package javaks;
import java.util.Scanner;
public class CSMain6 
{
	public static void main(String[] args)
	{
		int id=1;
		int i=0,option;
		String c,v;
		CSDisplay arr[]=new CSDisplay[10];
		Scanner ob=new Scanner(System.in);
		do
		{
			System.out.print("1.Registration \n2.View \n3.Exit");
			option=ob.nextInt();
			switch(option)
			{
				case 1:
					do
					{
						System.out.println("\tRegistration");
						System.out.println("\t************");
						System.out.println("Enter your name:");
						String name=ob.next();
						System.out.println("Enter your address:");
						String address=ob.next();
						System.out.println("Contact Number:");
						String contact=ob.next();
						System.out.println("Email ID:");
						String email=ob.next();
						System.out.println("Enter proof type:");
						String ptype=ob.next();
						System.out.println("Enter proof id:");
						String pid=ob.next();
						arr[i]=new CSDisplay();
						arr[i].register(id,name,address,contact,email,ptype,pid);
						System.out.println("Thank you for registering.Your id is :"+id);					
						System.out.println("Do you want to continue registration (y/n)?");
						c=ob.next();
						id++;
						i++;
					}
					while(c.equals("y"));
					break;
				case 2:
					System.out.println("Customers list");
					System.out.println("The registered customers are");
					System.out.println("Name\tId");
					for(int j=0;j<i;j++)
					{
						arr[j].display();
					}
					break;
				case 3:
					System.exit(0);
				default:
					break;
			}
			System.out.println("Do you want to continue (yes/no)");
			v=ob.next();
		}
			while(v.equals("yes"));
			System.out.println("Thank You");
			System.exit(0);
	}
}