
public class Package {
	
	protected int weight;
	protected char shippingMethod;
	protected double shippingCost;
	
	public double CalculateCost()
	{
		double cost = 0;
			if(shippingMethod == 'A')
			{
				if(weight >= 1 && weight <= 8)
				{
					cost =  2;
				}
				
				if(weight >= 9 && weight <= 16)
				{
					cost = 3;
				}
				
				if(weight >= 17)
				{
					cost = 4.5;
				}
		    }
			
			if(shippingMethod == 'T')
			{
				if(weight >= 1 && weight <= 8)
				{
					cost = 1.5;
				}
				
				if(weight >= 9 && weight <= 16)
				{
					cost = 2.35;
				}
				
				if(weight >= 17)
				{
					cost = 3.25;
				}
		    }
			
			if(shippingMethod == 'M')
			{
				if(weight >= 1 && weight <= 8)
				{
					cost  =  0.5;
				}
				
				if(weight >= 9 && weight <= 16)
				{
					cost = 1.5;
				}
				
				if(weight >= 17)
				{
					cost  = 2.15;
				}
		    }
		
		
		return cost;
	}
	
	public void Display()
	{
		
		System.out.println("Weight " + this.weight);
		System.out.println("SHipping method: " + this.shippingMethod);
		System.out.println("Cost " + this.shippingCost);
	}
	
	public Package(int w,char sm)
	{
		this.weight = w;
		this.shippingMethod = sm;
		this.shippingCost  = CalculateCost();
	}
	
	

}
