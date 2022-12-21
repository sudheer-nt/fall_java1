package accessmodifiers.charan;

public class DeclarationAsPrivateModifiers extends DeclartionAsPublic{

	// private access modifier can access only within class
	private int a9 = 2;
	private String b9 = "String private variable";

	public static void main(String[] args) {

		DeclarationAsPrivateModifiers pri = new DeclarationAsPrivateModifiers();
		System.out.println(pri.a9);
		System.out.println(pri.b9);
		System.out.println(a2);

	}

}
