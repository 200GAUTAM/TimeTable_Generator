package timeTableGenerator;
import java.util.*;


public class Professor {
	private int proId;
	private String proName;
	private ArrayList<CLASS> proClass;
	
	Professor(int proId, String proName, ArrayList<CLASS> proClass)
	{
		this.proId = proId;
		this.proName = proName;
		this.proClass = new ArrayList<CLASS>();
	}
	
	void addCourseClass(CLASS classCourse)
	{
		proClass.add(classCourse);
	}
	
	int getId()
	{
		return proId;
	}
	
	String getName()
	{
		return proName;
	}
	
	 ArrayList<CLASS> getCLASSList()
	{
		return proClass;
	}
	

}
