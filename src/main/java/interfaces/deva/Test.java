package interfaces.deva;

public class Test {

	public static void main(String[] args) {
		Country c = new America();
		Country c1 = new India();
		
		
		c.economyNo();
		c.countryName();
		c.countryCapital();
		
		
		c1.economyNo();
		c1.countryName();
		c1.countryCapital();
		
		System.out.println(c1.economyNo());
		System.out.println(c.countryName());

	}
	

}

