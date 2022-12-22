package inheritance.nachi;

public class Employer extends NaasConsultancy 
{ 
	String city;
	public void employer(String city)
	{
		this.city=city;
		System.out.println(city);
	}

}
