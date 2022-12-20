package methodoverriding.charan;

public class A3 extends A1 {

	@Override
	public void alphabet(int a) {

		System.out.println("A3 after overriden = " + a);
	}

	public static void main(String[] args) {

		A3 i = new A3();
		A1 i1 = new A1();
		i.alphabet(9);
		i1.alphabet(7);
	}

}
