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

	public void askQuestion() {

	}

	public void createShoppingList(String items) {
		myList.add(items.strip().toUpperCase());
		displayOutput(items.toUpperCase() + " Added.");
	}

	public void destroyShoppingList() {
		myList.clear();
		myList = null;
		scan = null;
		systemOutPut = null;
		if (myList == null) {
			displayOutput("list destroyed".toUpperCase().strip().toString());
		} else {
			displayOutput(myList);
		}
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

	public ArrayList<String> readShoppingList() {
		return myList;
	}

	public void removeShoppingListItem(String item) {
		myList.remove(item.strip().toUpperCase());
		displayOutput(item.toUpperCase() + " Removed.");
	}

	public void updateShoppingList(String oldItem, String newItem) {
		myList.set(myList.indexOf(oldItem.strip().toUpperCase()), newItem.toUpperCase());
		displayOutput(oldItem + " Updated to " + newItem);
	}
}