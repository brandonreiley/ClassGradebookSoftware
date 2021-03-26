import java.util.ArrayList;
import java.util.Scanner;



public class Main {
	
	public int IntegerCheck(String integer) {
		int i;
		try {
			i = Integer.parseInt(integer);
		}
		catch(NumberFormatException n) {
			i = -1;
		}
		return i;
	}


	public static void main(String[] args) {
		Main main = new Main(); 
		Scanner scan = new Scanner(System.in);
		boolean flag = false;
		ArrayList<Assignment> list = new ArrayList<Assignment>();
		do {
			System.out.println("What would you like to do?");
			System.out.println("Press 1 to Add Assignment.");
			System.out.println("Press 2 to Edit an Assignment.");
			System.out.println("Press 3 to View an Assignment's info.");
			System.out.println("Press 4 to Remove an Assignment.");
			System.out.println("Press 5 to Exit");
			String select = scan.nextLine();
			int choice = main.IntegerCheck(select);
			switch(choice) {
			
			case 1 :
				System.out.println("Add Assignment:");
				System.out.println("Please enter the name of the assignment");				
				String name = scan.nextLine();
				break;
			
			case 2:
				System.out.println("Edit Assignment:");
				//list all assignments by name				
				System.out.println("Please enter the name of the assignment you want to edit");
				String assignName = scan.nextLine();
				break;
			
			case 3:
				System.out.println("View Assignment info:");
				System.out.println("Please enter the name of the assignment you want to view");
				String assign = scan.nextLine();
				break;
			
			case 4:
				System.out.println("Remove Assignment:");
				System.out.println("Please enter the name of the assignment you want to remove");
				String assignNam = scan.nextLine();
				break;
			
			case 5:
				flag = true;
				System.out.println("Closing Program");
				break;
			
			default :
				System.out.println("Invalid Choice. Please choose between 1 and 5");
					
		} 
	} while(!flag);
}
}
