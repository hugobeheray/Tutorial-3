
public class PreferredCustomer extends Customer {

	protected int customerPurchase, discountLevel;
	

	public PreferredCustomer(String nam,String add, int n, int cn, boolean boo, int CP) {
		super(nam,add,n,cn,boo);
		this.customerPurchase = CP;
		if(customerPurchase >= 500 && customerPurchase < 1000)
		{
			this.discountLevel = 5;
		}
		
		if(customerPurchase >= 1000 && customerPurchase < 1500)
		{
			this.discountLevel = 6;
		}
		
		if(customerPurchase >= 1500 && customerPurchase < 2000)
		{
			this.discountLevel = 7;
		}
		
		if(customerPurchase >= 2000)
		{
			this.discountLevel = 10;
		}
		
	}
	
	public  void Display()
	{
		System.out.println(this.name);
		System.out.println(this.address);
		System.out.println(this.number);
		System.out.println(this.customerNumber);
		System.out.println(this.bool);
		System.out.println(this.customerPurchase);
		System.out.println(this.discountLevel);
		
	}
	
	public void setCustomerPurchase(int newPurchase)
	{
		customerPurchase = newPurchase;
	}

	public void setDiscountLevel(int newDiscount)
	{
		discountLevel = newDiscount;
	}
	
	public int getCustomerPurchase()
	{
		return customerPurchase;
	}
	
	public int getDiscountLevel()
	{
		return discountLevel;
	}
}
