package pantrycart;

public class RunProgram {

	public static void main(String[] args) { // TODO Auto-generated method stub
		try {
			RunProgram rP = new RunProgram();
			System.out.print(rP.greetCustomer());
		} catch (Exception e) { // TODO: handle exception
			System.out.print(e.getStackTrace());
		} finally {
			System.exit(0);
		}
	}

	private String greetings;

	public RunProgram() {
		// TODO Auto-generated constructor stub
		greetings = "Assalam-O-Alaikum Customer";
	}

	public String greetCustomer() {
		return this.greetings;
	}
}
