import java.util.ArrayList;
import java.util.Scanner;


public class mainFunc {
	public static final Scanner userInput = new Scanner(System.in);
	
	public static void listGroups(ArrayList<Children_group> children_groups) {
		System.out.println("\nAll children groups:");
		int i = 1;
		for(Children_group group: children_groups) {
			System.out.printf("%d: %s\n", i, group.getName());
			i++;
		}
	}
	
	public static Boolean isInteger(String number) {
		if(number == null)
			return false;
		try {
			Integer.parseInt(number);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}
	
	public static Integer menuChoice() {
		while(true) {
			System.out.println("\nSelect an action:");
			System.out.println("1. View groups");
			System.out.println("2. Create a new group");
			System.out.println("3. Add children to a group");
			System.out.println("4. Exit");
			System.out.printf("Choose a number: ");
			String choice = userInput.nextLine();
			if(!isInteger(choice)) {
				System.out.println("Please input a number!");
				userInput.nextLine();
				continue;
			}
			Integer choiceInt = Integer.parseInt(choice);
			if(choiceInt < 1 || choiceInt > 3) {
				System.out.println("Please input a number between 1 and 3!");
				userInput.nextLine();
				continue;
			}
			return choiceInt;
		}
	}
	
	public static void viewGroupsMenu(Children_Group_Collection group_collection) {
		while (true) {
			if (group_collection.getChildrenGroups().size() == 0) {
				System.out.println("There are no groups yet!");
				userInput.nextLine();
				return;
			}
			listGroups(group_collection.getChildrenGroups());
			System.out.println("\n0: Go back");
			System.out.printf("1-%d: View children inside the chosen group\n", group_collection.getChildrenGroups().size());
			System.out.printf("Choose number: ");
			String choice = userInput.nextLine();
			
			if (!isInteger(choice)) {
				System.out.println("Choose a number!");
				userInput.nextLine();
				continue;
			}
			Integer choiceInt = Integer.parseInt(choice);
			if (choiceInt < 0 || choiceInt > group_collection.getChildrenGroups().size()) {
				System.out.printf("Choose a number between 0 and %d!", group_collection.getChildrenGroups().size());
				userInput.nextLine();
				continue;
			}
			if (choiceInt == 0)
				return;
			Children_group chosenGroup = group_collection.getChildrenGroups().get(choiceInt-1);
			System.out.printf("%d. %s\n", choiceInt, chosenGroup.getName());
			System.out.printf("Teacher: %s %s\n", chosenGroup.getTeacher().getFirstName(), chosenGroup.getTeacher().getLastName());
			if (chosenGroup.getChildren().size() == 0) {
				System.out.println("There are no children in this group.");
			}
			else {
				int i = 1;
				for (Child child: chosenGroup.getChildren()) {
					System.out.printf("%d. %s %s\n", i, child.getFirstName(), child.getLastName());
					i++;
				}
			}
			userInput.nextLine();
			return;
		}
	}

	public static void main(String[] args) {
		Children_Group_Collection group_collection = new Children_Group_Collection();
		
		// test data
		Employee employee1 = new Employee("First name 1", "Last name 1", "Teacher", "their address 1");
		Employee employee2 = new Employee("First name 2", "Last name 2", "Teacher", "their address 2");
		group_collection.create_new_group("UwU", employee1);
		group_collection.create_new_group("OwO", employee2);
		group_collection.add_child_to_group(group_collection.getChildrenGroups().get(0), child);

		System.out.println("Welcome to KinderApp!");
		while (true) {
			Integer choice = menuChoice();
			switch (choice) {
			case 1:
				viewGroupsMenu(group_collection);
				break;
			default:
				System.out.println("Please input a number between 1 and 3!");
				break;
			} 
		}

//		listGroups(group_collection.getChildrenGroups());
	}

}
