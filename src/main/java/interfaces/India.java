package interfaces;

public class India implements Country {

	@Override
	public int economyNo() {
		System.out.println("economyNo is 5");
		return 0;
	}

	@Override
	public String countryName() {
		System.out.println("India");
		return null;
	}

	@Override
	public String countryCapital() {
		System.out.println("Delhi");
		return null;
	}

}
