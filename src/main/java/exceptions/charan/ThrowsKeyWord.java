package exceptions.charan;

public class ThrowsKeyWord {

	static void overs(int balls) throws ArithmeticException
	{
		if(balls<6)
		{
			throw new ArithmeticException("exception occurs,balls should be 6 ");
		}
		else
		{
			System.out.println("balls should be minimum 6 in over ");
		}
	}

	public static void main(String[] args) {

		
		overs(5);
		

	}

}
