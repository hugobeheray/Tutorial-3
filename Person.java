
public class Person {

	protected String name, address;
	protected int number;
	
	public Person(String nam,String add, int n){
		this.address = add;
		this.name  = nam;
		this.number = n;
	}

	public void setAddress(String newAdd)
	{
		this.address = newAdd;
	}
	
	public void setNumber(int newNum)
	{
		this.number = newNum;
	}
	
	public void setName(String newName)
	{
		this.name = newName;
	}
	
	public int getNumber()
	{
		return number;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public String getName()
	{
		return name;
	}
	
	
}
