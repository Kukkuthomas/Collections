package javaks;
import java.util.Scanner;
public class CSEmail4
{
		
	static String name,address,contactNumber,email,proofType,proofId;
	static Scanner s=new Scanner(System.in);
	static String mail;

	public static void main(String args[])
	{
		CSEmail4 obj=new CSEmail4();
		CSUpdation4 regUp=new CSUpdation4();
		String c,ans;
		System.out.println("Registration\n\n");
		do
		{
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
			c=regUp.register(name, address, contactNumber, email, proofType, proofId);
		}
		while(c.equals("y"));
		
		System.out.println("Do you want to update the email id?(yes/no)\n");
		ans=s.nextLine();
		if(ans.equals("yes"))
		{
			System.out.println("Update Email\n");
			System.out.println("Enter new Email Id");
			regUp.email=s.nextLine();
			System.out.println("Email Updated\n");
		}
		
		System.out.println("Your details are as follows\n");
		System.out.println("Name: "+name+"\nAddress: "+address+"\nContact Number: "+contactNumber+"\nE-Mail ID: "+regUp.email+"\nProof type: "+proofType+"\nProof id: "+proofId+"\n");
	}
}
