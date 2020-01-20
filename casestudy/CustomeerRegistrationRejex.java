package casestudy;

import java.util.Scanner;

public class CustomeerRegistrationRejex 
{
	String name,address,contactno,email,prooftype,proofid;
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		CustomeerRegistrationRejex obj=new CustomeerRegistrationRejex();
		System.out.println("Enter your name");
		obj.name=s.nextLine();
		System.out.println("Enter your address");
		obj.address=s.nextLine();
		System.out.println("Enter your contact number");
		obj.contactno=s.nextLine();
		System.out.println("Enter your Email Id");
		obj.email=s.nextLine();
		System.out.println("Enter your Proof Type");
		obj.prooftype=s.nextLine();
		System.out.println("Enter your Proof Id");
		obj.proofid=s.nextLine();
		
		System.out.println("\tRegistration Details");
		System.out.println("\t********************");
		System.out.println("Name : "+obj.name);
		System.out.println("Address : "+obj.address);
		System.out.println("Contact No : "+obj.contactno);
		System.out.println("Email Id : "+obj.email);
		System.out.println("Proof Type : "+obj.prooftype);
		System.out.println("Proof Id : "+obj.proofid);
	}
}