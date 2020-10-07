
public class Customer extends Person {
	
	protected int customerNumber;
	protected boolean bool;
	public Customer(String nam,String add, int n, int cn, boolean boo)
	{
		super(nam,add,n);
		this.customerNumber = cn;
		this.bool = boo;
	}
	
	public  void setCustomerNumber(int newCN)
	{
		customerNumber = newCN;
	}
	
	public void setBoolean(boolean newBool)
	{
		bool = newBool;
	}
	
	public boolean getBool()
	{
		return bool;
	}
	
	public int getCustomerNumber()
	{
		return customerNumber;
	}

}
