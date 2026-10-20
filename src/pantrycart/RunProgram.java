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
			rP.optionMenu();
			String op;
			while (true) {
				op = rP.getUserInput("Enter Option No: ");
				switch (op) {
				case "1": {
					rP.createShoppingList(rP.getUserInput("Add Item: "));
					break;
				}
				case "2": {
					rP.displayOutput(rP.readShoppingList());
					break;
				}
				case "3": {
					rP.updateShoppingList(rP.getUserInput("Old Item: "), rP.getUserInput("New Item: "));
					break;
				}
				case "4": {
					rP.removeShoppingListItem(rP.getUserInput("Enter ITEM: "));
					break;
				}
				case "5": {
					rP.destroyShoppingList();
					break;
				}
				default: {
					rP.displayOutput("Option NOT FOUND: " + op + "!");
					break;
				}
				}
				if (Integer.parseInt(op) >= 5 || Integer.parseInt(op) <= 0) {
					break;
				}
			}
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