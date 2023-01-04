package hello;

public class Suman
{
     static String name="suman";
	 static float b=3.0f;
	 
public static void main(String []args)
{    float f=Suman.b;
	if(name=="suman")
	{
		System.out.println("customer is valid to access");
	}
	else
		System.out.println("Customer is invalid to access");
	
	for(int i=1; i<=5;i++)
	{   
		System.out.println(i);
	}
	//System.out.println(name+b);
	
}
}
