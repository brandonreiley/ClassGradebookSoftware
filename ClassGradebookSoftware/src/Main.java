import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public int IntegerCheck(String integer) {
		int i;
		try {
			i = Integer.parseInt(integer);
		} catch (NumberFormatException n) {
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
			System.out.println("Class Gradebook Main Menu");
			System.out.println("-------------------------");
			System.out.println("What would you like to do?");
			System.out.println("Press 1 to Add Assignment.");
			System.out.println("Press 2 to Edit an Assignment.");
			System.out.println("Press 3 to View the Assignment List.");
			System.out.println("Press 4 to Remove an Assignment.");
			System.out.println("Press 5 to Exit");
			String select = scan.nextLine();
			int choice = main.IntegerCheck(select);

			switch (choice) {

			case 1:
				System.out.println("Add Assignment:");
				System.out.println("Please enter the name of the assignment:");
				String name = scan.nextLine();
				System.out.println("Please enter the assignment type:");
				String type = scan.nextLine();
				System.out.println("Please enter a description of the assignment:");
				String desc = scan.nextLine();
				System.out.println("Please assign an ID for the assignment:");
				int ID = scan.nextInt();
				scan.nextLine();
				System.out.println("Please assign a percentage for the assignment:");
				double percentage = scan.nextDouble();
				scan.nextLine();
				Assignment temp = new Assignment(name, type, desc, ID, percentage);
				System.out.println("\nAssignment Added.\n");
				list.add(temp);
				break;

			case 2:
				System.out.println("Edit Assignment:");
				// list all assignments by name
				System.out.println("Please enter the ID of the assignment you want to edit");
				int assignEdit = scan.nextInt();
				scan.nextLine();
				int index = -1;
				int i = 0;
				boolean flag2 = false;
				while (flag2 != true && i < list.size()) {
					if (assignEdit == list.get(i).getID()) {
						index = i;
						flag2 = true;
					} else {
						i++;
					}
				}
				if (index == -1)
					System.out.println("\nError: Assignment does not exist.\n");
				else {
					System.out.println("\nPlease pick a field to edit:");
					System.out.println("Press 1 for name.");
					System.out.println("Press 2 for type.");
					System.out.println("Press 3 for description.");
					System.out.println("Press 4 for ID.");
					System.out.println("Press 5 for percentage.");
					int editChoice = scan.nextInt();
					scan.nextLine();

					if (editChoice == 1) {
						System.out.println("Please input a new name:");
						String newName = scan.nextLine();
						list.get(index).setName(newName);
						System.out.println("Name Updated.\n");
					}

					else if (editChoice == 2) {
						System.out.println("Please input a new type:");
						String newType = scan.nextLine();
						list.get(index).setType(newType);
						System.out.println("Type Updated.\n");
					}

					else if (editChoice == 3) {
						System.out.println("Please input a new description:");
						String newDesc = scan.nextLine();
						list.get(index).setDescription(newDesc);
						System.out.println("Description Updated.\n");
					}

					else if (editChoice == 4) {
						System.out.println("Please input a new ID:");
						int newID = scan.nextInt();
						scan.nextLine();
						list.get(index).setID(newID);
						System.out.println("ID updated.\n");
					}

					else if (editChoice == 5) {
						System.out.println("Please input a new percentage:");
						double newPercentage = scan.nextDouble();
						scan.nextLine();
						list.get(index).setPercentage(newPercentage);
						System.out.println("Percentage Updated.\n");
					}

					else {
						System.out.println("\nError: Please choose between 1 and 5");
					}
				}
				break;

			case 3:
				System.out.println("View the Assignment List:");
				Collections.sort(list);
				if(list.size() == 0) {
					System.out.println("\nThe Assignment list is empty.\n");
				}
				else {
					for (int j = 0; j < list.size(); j++) {
						System.out
								.println("\nName: " + list.get(j).getName() + " Percentage: " + list.get(j).getPercentage()
									+ "\n" + "ID:" + list.get(j).getID() + " Type: " + list.get(j).getType());
						System.out.println("Description: " + list.get(j).getDescription());
					}
					System.out.println("\n");
				}
				break;

			case 4:
				System.out.println("Remove Assignment:");
				System.out.println("Please enter the ID of the assignment you want to remove:");
				int assignRemove = scan.nextInt();
				scan.nextLine();
				index = -1;
				i = 0;
				flag2 = false;
				while (flag2 != true && i < list.size()) {
					if (assignRemove == list.get(i).getID()) {
						index = i;
						flag2 = true;
					} else {
						i++;
					}
				}
				if (index == -1) {
					System.out.println("\nError: Assignment does not exist.\n");
				} else {
					System.out.println("\nAssignment ID No. " + assignRemove + " Removed.\n");
					list.remove(index);
				}
				break;

			case 5:
				scan.close();
				flag = true;
				System.out.println("\nProgram Closed.");
				break;

			default:
				System.out.println("\nError: Invalid Choice. Please choose between 1 and 5\n");
			}

		} while (!flag);
	}
}
