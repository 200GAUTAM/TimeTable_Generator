package timeTableGenerator;

public class Room {
	static int _nextRoomID;
	
	private int RooId;
	private String RooName;
	private boolean RooLabs;
	private int RooNumberOfSeats;
	
	Room(String RooName, boolean RooLabs, int RooNumberOfSeats)
	{
		_nextRoomID = 0;
		this.RooId++;
		this.RooName = RooName;
		this.RooLabs = RooLabs;
		this.RooNumberOfSeats = RooNumberOfSeats;
		
	}
	
	int GetId()
	{
		return RooId;
	}
	
	String GetName()
	{
		return RooName;
	}
	
	boolean isLab()
	{
		return RooLabs;
	}
	
	int GetNumberOfSeats()
	{
		return RooNumberOfSeats;
	}
	
	void RestartIds()
	{
		_nextRoomID = 0;
	}

}
