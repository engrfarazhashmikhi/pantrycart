package pantrycart;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaFunctions {
	private ArrayList<String> myList;
	private Scanner scan;
	private Object systemOutPut;

	public JavaFunctions() {
		myList = new ArrayList<>();
	}

	public void askQuestion(String question) {
		systemOutPut = question.strip().toString();
		displayOutput(systemOutPut);
	}

	public void createShoppingList(String items) {
		myList.add(items.strip().toUpperCase());
		displayOutput(items.toUpperCase() + " Added.");
	}

	public void destroyShoppingList() {
		myList.clear();
		scan.close();
		myList = null;
		systemOutPut = null;
		System.gc();
	}

	public void displayOutput(Object userData) {
		if (userData == null) {
			systemOutPut = "that's all folks".toUpperCase();
		} else {
			systemOutPut = userData;
		}
		System.out.println(systemOutPut);
	}

	public String getUserInput(String question) {
		scan = new Scanner(System.in);
		this.displayOutput(question);
		String userText = scan.nextLine();
		userText.strip();
		return userText;
	}

	public void optionMenu() {
		askQuestion("Select an Option: ");
		askQuestion("1: Create Shopping List.");
		askQuestion("2: Read Shopping List.");
		askQuestion("3: Update Shopping List");
		askQuestion("4: Remove Item From Shopping List.");
		askQuestion("5: Destroy Shopping List.");

	}

	public ArrayList<String> readShoppingList() {
		return myList;
	}

	public void removeShoppingListItem(String item) {
		if (myList.isEmpty()) {
			displayOutput("Shopping List is EMPTY");
		} else {
			myList.remove(item.strip().toUpperCase());
			displayOutput(item.toUpperCase() + " Removed.");
		}
	}

	public void updateShoppingList(String oldItem, String newItem) {
		if (!myList.isEmpty()) {
			myList.set(myList.indexOf(oldItem.strip().toUpperCase()), newItem.toUpperCase());
			displayOutput(oldItem + " Updated to " + newItem);
		} else {
			displayOutput("Shpooing List is EMPTY");
		}
	}
}