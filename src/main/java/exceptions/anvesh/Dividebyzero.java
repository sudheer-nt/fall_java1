package exceptions.anvesh;

public class Dividebyzero {

	void checkexception(int a, int b) {
		try {
            System.out.println(" Success: a divide by b is : " + a / b); 
        }
        catch (ArithmeticException e) {

            System.out.println(
                "Provided value of B is zero.");
            System.out.println(e);
        }
		finally {
            System.out.println("In Finally Block");
		}
	}

}
