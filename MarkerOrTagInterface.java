package InterfaceReference;

class Userr implements Cloneable
{
	int id;
	String name;
	String address;
	public Userr(int id, String name, String address)
	{
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		// TODO Auto-generated method stub
		return super.clone();    //invoke Object class Clone() method
	}

	@Override
	public String toString() 
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Userr [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", address=");
		builder.append(address);
		builder.append("]");
		return builder.toString();
	}
}

public class MarkerOrTagInterface 
{
	public static void main(String[] args)
	{
		Userr user1 = new Userr(101,"Deesha","Deshapriya Park");
		try
		{
			Userr user2 = (Userr)user1.clone();  //copy user1 to user2
			
			System.out.println("User1 : "+user1);
			System.out.println("User2 : "+user2);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
