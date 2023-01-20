package exceptions;

public class SampleJavaExceptions {

	public static void main(String[] args) 
		{
		  //String str = null;
		//  System.out.println(str.length());
		  
		  try {
			  int a= 10 , b= 0;
			  int c= a/b;
			  System.out.println("result ="+c);
		  }
		  catch(ArithmeticException e)
		  {
			  System.out.println(" Cant divide a number by zero");
			  
		  }
		}}

		  
		  
		
		  
		  
		  
		  
			
			
		

	


