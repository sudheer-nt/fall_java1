package exceptions.anvesh;

public class Main  {
	public static void main(String args[])
	{
		Dividebyzero d = new Dividebyzero();
		d.checkexception(10,0);
		d.checkexception(100, 10);
	}
}
