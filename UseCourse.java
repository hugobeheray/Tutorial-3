import java.util.Scanner;

public class UseCourse {

	public static void main(String[] args) {
		String dep;
		int cn,cred;
		Scanner in = new Scanner(System.in); 
		System.out.println("Department:");
		dep = in.next();
		System.out.println("credit:");
		cred =  in.nextInt();
		System.out.println("Course number:");
		cn  = in.nextInt();
		
		if(dep == "BIO" ||  dep == "CHM" || dep == "CIS" || dep == "PHY")
		{
			LabCourse LC = new LabCourse(dep, cn, cred);
			LC.Display();
		}
		else
		{
			CollegeCourse CC =  new CollegeCourse(dep, cn, cred);
			CC.Display();
		}
		in.close();
		
		
		
		
		

	}

}
