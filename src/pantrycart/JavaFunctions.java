package pantrycart;
import java.util.Scanner;
import java.util.ArrayList;
public class JavaFunctions {
	private Scanner scan;
	private ArrayList<String> myList;
	public JavaFunctions() {
		// TODO Auto-generated constructor stub
		 myList = new ArrayList<String>();
	}
	public void displayOutput(Object userData) {
		Object systemOutPut;
		if (userData == null) {
			systemOutPut = "that's all folks".toUpperCase();
		}
		else {
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
	public void createShoppingList(String items){
		 myList.add(items.strip().toUpperCase());
		 displayOutput(items.toUpperCase() + " Added.");
	}
	public ArrayList<String> readShoppingList(){
		 return myList;
	}
	public void updateShoppingList(String oldItem, String newItem){
		myList.set(myList.indexOf(oldItem.strip().toUpperCase()), newItem.toUpperCase());
		displayOutput(oldItem + " Updated to " + newItem);
	}
	public void removeShoppingListItem(String item){
		myList.remove(item.strip().toUpperCase()); displayOutput(item.toUpperCase() + " Removed.");
	}
	public void destroyShoppingList() {
		myList.clear(); myList =  null; scan = null;
		if(myList == null) {
			displayOutput("list destroyed".toUpperCase().strip().toString());
		}
		else {
			displayOutput(myList);
		}
		System.gc();
	}
}
