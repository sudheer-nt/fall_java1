package inheritance.charan;

public class Samsung extends MobilePhone implements Charger {

	public void touchScreen() {
		System.out.println("Touch screen for samsung");
	}

	public void socket() {
		System.out.println("took interface method");
	}

	public static void main(String[] args) {
		Samsung s1 = new Samsung();
		s1.touchScreen();
		s1.socket();
		MobilePhone s2 = new Samsung();
		s2.touchScreen();
		
	}
	
}
