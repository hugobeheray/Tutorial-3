
public class InsuredPackage extends Package{
	
	protected  double insuranceCost;
	
	public InsuredPackage(int w, char sm)
	{
		super(w,sm);
		if(shippingCost >= 0 && shippingCost <=1)
		{
			this.insuranceCost = 2.45;
		}
		if(shippingCost >= 1.01 && shippingCost <=3)
		{
			this.insuranceCost = 3.95;
		}
		if(shippingCost >= 3.01)
		{
			this.insuranceCost = 5.55;
		}
		shippingCost += insuranceCost;
			
	}

}
