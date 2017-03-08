package timeTableGenerator;

import java.util.ArrayList;

public class StudentsGroup {
	private int stuId;
	private String stuName;
	private int stuNumber;
	private ArrayList<CLASS> stuClass;
	
	StudentsGroup(int stuId, String stuName, int stuNumber, ArrayList<CLASS> stuClass)
	{
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuNumber = stuNumber;
		this.stuClass = stuClass;
	}
	
	int getId()
	{
		return stuId;
	}
	
	String getStuName()
	{
		return stuName;
	}
	
	ArrayList<CLASS> getStuClass()
	{
		return stuClass;
	}

}
