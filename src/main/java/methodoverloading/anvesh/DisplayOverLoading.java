package methodoverloading.anvesh;

class Director
{
	void ram(String moviename,String hero)
	{
		System.out.println(moviename+" "+hero);
	}
	void ram(String moviename,String hero,int age)
	{
		System.out.println(moviename+" "+hero+" "+age);
	}
}
public class DisplayOverLoading {

	public static void main(String[] args) 
	{
		Director d =new Director();
		d.ram("RRR", "Ramcharan");
         d.ram("RRR","NTR",45);
	}

}
