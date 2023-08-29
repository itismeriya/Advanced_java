package collectionDemo;

public class Employee implements Comparable<Employee>{

	private int Id;
	private String name;
	private String address;
	public int getId(int id) {
		return id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Employee(int Id, String name, String address) {
		super();
		this.Id = Id;
		this.name = name;
		this.address = address;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [Id=");
		builder.append(Id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", address=");
		builder.append(address);
		builder.append("]");
		return builder.toString();
	}
	
	
//	@Override
//	public int compareTo(Object o) {
//		Employee e=Employee(o);
//		return 0;
//	}
	
	@Override
	public int compareTo(Employee o) //single sorting sequence only
	{
		if(Id==o.Id) 
			return 0;
		else if(Id>o.Id)
			return 1;
		else
			return -1;
	}
	
	

}
