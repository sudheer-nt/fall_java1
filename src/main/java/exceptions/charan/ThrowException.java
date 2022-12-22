package exceptions.charan;

public class ThrowException {
	
	static void overs(int balls)
	{
		if(balls<6)
		{
			//we can know which exception type going to occur if its less than 6
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
