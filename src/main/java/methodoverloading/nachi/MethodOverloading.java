package methodoverloading.nachi;

class Movies
{
	public void movies(String name,String heroname,String movieid,String director)
	{
		System.out.println(name+ " "+heroname+" "+movieid+" "+director);
	}
	public void movies(String name,String heroname,String movieid,int age,String director)
	{
		System.out.println(name+" "+heroname+" "+movieid+" "+age+" "+director);
	}
}
public class MethodOverloading {

	public static void main(String[] args) 
	{
		Movies m =new Movies();
		m.movies("major","adivisesh","action","shashikirantikka");
		m.movies("F3","venkatesh","comedy",60,"Anilravipudi");
	}

}
