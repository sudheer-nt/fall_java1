package methodoverloading.charan;

public class Sport {

	int players = 11;
	
	private int a;

	public Sport(int a)
	{
		this.a = a;
	}

	public void rules(int time, String timings) 
	{
		
		System.out.println("sport class method" + time + " " + timings);
	}
	
	public void rules1(int time1, String timings1) 
	{
		System.out.println("sport class method"+ time1 + " " + timings1);
	}
}
