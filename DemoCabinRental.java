import  java.util.Scanner;
public class DemoCabinRental {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); 
		int cab;
		System.out.println("Cabin: ");
		cab = in.nextInt();
		HolidayCabinRental loc = new HolidayCabinRental(cab);
		System.out.println("You chose cabin " + loc.getCabinNumber() + " for a  total  cost of " + loc.getWeeklyRentalRate() + " per week");
		in.close();

	}

}
