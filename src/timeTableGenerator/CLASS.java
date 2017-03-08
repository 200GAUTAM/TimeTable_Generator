package timeTableGenerator;

import java.util.ArrayList;

public class CLASS {
	Course CLACourse;
	Professor CLAProfessor;
	ArrayList<StudentsGroup> CLAStudentsGroup;
	int CLANumberOfSeats;
	boolean CLARequireLabs;
	int CLADuration;
	
	CLASS(Course CLACourse, Professor CLAProfessor, ArrayList<StudentsGroup> CLAStudentsGroup, int CLANumberofSeats
			, boolean CLARequireLabs, int CLADuration)
	{
		this.CLACourse = CLACourse;
		this.CLAProfessor = CLAProfessor;
		this.CLAStudentsGroup = new ArrayList<StudentsGroup>();
		this.CLANumberOfSeats = CLANumberofSeats;
		this.CLARequireLabs = CLARequireLabs;
		this.CLADuration = CLADuration;
		
	}
	
	

}
