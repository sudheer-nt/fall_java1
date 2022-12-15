package methodoverriding.nachi;

public class MethodOverridingTest {

	public static void main(String[] args) {
		Loan bl = new Bankloan();
		bl.croploan();
		bl.homeloan();
	}

}
