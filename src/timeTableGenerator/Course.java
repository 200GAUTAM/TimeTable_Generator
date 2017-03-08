package timeTableGenerator;

public class Course {
	private int couId;
	private String couName;
	
	Course(int couId, String couName)
	{
		this.couId = couId;
		this.couName = couName;
	}
	
	int getCourseId()
	{
		return couId;
	}
	
	String getCourseName()
	{
		return couName;
	}

}
