package javaks;
import java.util.Scanner;
public class CSMain1 
{
		
	String name,address,contactNumber,email,proofType,proofId;

	public CSMain1(String name,String address,String contactNumber,String email,String proofType,String proofId)
	{
		this.name=name;
		this.address=address;
		this.contactNumber=contactNumber;
		this.email=email;
		this.proofType=proofType;
		this.proofId=proofId;
		
	}
	void display()
	{
		System.out.println("\n\nThank you for registering. Your id is 1..");
	}
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String name,address,contactNumber,email,proofType,proofId;
		
		System.out.println("Registration\n\n");
		System.out.println("Enter your name");
		name=s.nextLine();
		System.out.println("Enter your address");
		address=s.nextLine();
		System.out.println("Contact Number");
		contactNumber=s.nextLine();
		System.out.println("E-Mail ID");
		email=s.nextLine();
		System.out.println("Enter proof type");
		proofType=s.nextLine();
		System.out.println("Enter proof id");
		proofId=s.nextLine();
		
		CSMain1 obj=new CSMain1(name,address,contactNumber,email,proofType,proofId);
		obj.display();
		s.close();
	}
}
