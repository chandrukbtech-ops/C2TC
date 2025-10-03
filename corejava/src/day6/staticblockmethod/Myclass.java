package day6.staticblockmethod;

public class Myclass {
private int section ; 
	
	// Static or class variable
	private static int srNo;
	
	// Static Block
	static
	{
		System.out.println("____Within Static Block-_____");
		srNo=1000;	// Reassign or Initialize Static Values
	}
	
	void MyClass(){
		System.out.println("_____Within Default Constructor_____");
		srNo++;
		section++;		
	}
	
	@Override
	public String toString() {
		return "MyClass [Serial No= " + srNo + ", Section= " + section + "]";
	}

	static void display() {
	//	System.out.println("Section : " + section); // Can't access Non-static members	
		System.out.println("Serial No. " + srNo); 
	}
}
