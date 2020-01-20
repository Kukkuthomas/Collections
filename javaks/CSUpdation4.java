package javaks;
import java.util.Scanner;
public class CSUpdation4 
{
	static Scanner s=new Scanner(System.in);
	static int id=100;
	static String name;
	static String address;
	static String contactNumber;
	static String email;
	static String proofType;
	static String proofId;
	String register(String name,String address,String contactNumber,String email,String proofType,String proofId)
	{
		this.name=name;
		this.address=address;
		this.contactNumber=contactNumber;
		this.email=email;
		this.proofType=proofType;
		this.proofId=proofId;
		
		System.out.println("\n\nThank you for registering. Your id is "+id++ +"..");
		System.out.println("Do you want to continue registration (y/n)?");
		String c=s.nextLine();
		
		return c;
	}

}
