package Question3;

import java.io.IOException;


public class MainClass {

	
	public static void main(String[] args) throws IOException{
		Counselling counselling = new Counselling();
		
		counselling.readFile("studentDetails.xlsx", "programDetails.xlsx");
		counselling.intializePrograms();		
		counselling.allocate();
		counselling.save();
		
	}
}