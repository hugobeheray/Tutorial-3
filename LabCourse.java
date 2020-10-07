
public class LabCourse extends CollegeCourse  {
	
	public LabCourse(String dep, int cn,int cred)
	{
		super(dep,cn,cred);
		fee+=50;
		
	}
	
	public void Display()
	{
		System.out.println("This is  a  lab course");
		System.out.println("Department: " + this.department);
		System.out.println("Course number: " + this.courseNumber);
		System.out.println("Credit: " + this.credit);
		System.out.println("Fee: " + this.fee);
	}
}
