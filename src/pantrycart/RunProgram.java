package pantrycart;

/**
 * Create a Shopping List Java Program. Create a shopping list. Display created
 * shopping list. Update items in shopping list Remove a single item from
 * shopping list. Destroy created shopping list.
 */
public class RunProgram extends JavaFunctions {
	public static void main(String[] args) { // TODO Auto-generated method stub
		try {

			RunProgram rP = new RunProgram();
			// Create NEW List
			rP.createShoppingList(rP.getUserInput("Enter Item:").toUpperCase());
			// Display Items From Shopping List
			rP.displayOutput(rP.readShoppingList());
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			System.exit(0);
		}
	}

	private String greetings;

	public RunProgram() {
		greetings = "Assalam-O-Alaikum Customer";
	}

	public String greetCustomer() {
		return this.greetings;
	}
}