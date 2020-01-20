package javaks;
public class CSDisplay 
{

	int id;
	String name;
	String address;
	String contact;
	String email;
    String ptype;
	String pid;
	public void register(int id,String name,String address,String contact,String email,String ptype,String pid)
	{
		this.id=id;
		this.name=name;
		this.address=address;
		this.contact=contact;
		this.email=email;
		this.ptype=ptype;
		this.pid=pid; 
	}
		
	public void display()
	{
		System.out.println(name+"\t"+id);
	}
}
