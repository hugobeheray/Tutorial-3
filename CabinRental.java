
public class CabinRental {
	
	protected int cabinNumber;
	protected double weeklyRentalRate;
	
	
	public CabinRental(int cabNum) {
		cabinNumber = cabNum;
		
		if(cabinNumber == 1 || cabinNumber == 2 || cabinNumber == 3)
		{
			weeklyRentalRate = 950; 
		}
		else
			weeklyRentalRate = 1100;
		
	}
	public int getCabinNumber()
	{
		return cabinNumber;
	}

	public double getWeeklyRentalRate()
	{
		return  weeklyRentalRate;
	}
}
