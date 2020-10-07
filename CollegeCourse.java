
public class CollegeCourse {
	
	protected String  department;
	protected int courseNumber;
	protected  int credit;
	protected int fee;
	
	
	public CollegeCourse(String dep, int cn,int cred)
	{
		this.courseNumber = cn;
		this.credit = cred;
		this.department = dep;
		this.fee = 120 * cred;
	}
	
	public void Display()
	{
		System.out.println("Department: " + this.department);
		System.out.println("Course number: " + this.courseNumber);
		System.out.println("Credit: " + this.credit);
		System.out.println("Fee: " + this.fee);
	}
	

}
