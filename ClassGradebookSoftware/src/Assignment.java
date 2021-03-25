import java.util.ArrayList;
import java.util.Scanner;

public class Assignment {
	private String name;
	private String type;
	private String description;
	private int ID;
	private double percentage;
	

	public Assignment(String name, String type, String description, int ID, double percentage) {
		this.name = name;
		this.type = type;
		this.description = description;
		this.ID = ID;
		this.percentage = percentage;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Assignment> list = new ArrayList<Assignment>();
		System.out.println("What would you like to do?");
		System.out.println("Press 1 to Add Assignment, 2 to Edit an Assignment, 3 to View an Assignment's info, 4 to Remove an Assignment.");
		
		int userChoice = scan.nextInt();
		
		if(userChoice == 1) {
			System.out.println("Add Assignment:");
			System.out.println("Please enter the name of the assignment");				
			String name = scan.nextLine();
		}
		else if(userChoice == 2) {
			System.out.println("Edit Assignment:");
			//list all assignments by name				
			System.out.println("Please enter the name of the assignment you want to edit");
			String assignName = scan.nextLine();
		}
		else if(userChoice == 3) {
			System.out.println("View Assignment info:");
			System.out.println("Please enter the name of the assignment you want to view");
			String assignName = scan.nextLine();
		}
		else if(userChoice == 4) {
			System.out.println("Remove Assignment:");
			System.out.println("Please enter the name of the assignment you want to remove");
			String assignName = scan.nextLine();
		}
	}
}
