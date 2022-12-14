package accessmodifierscharanpackage;

public class DeclaredAsProtected {

	// protected modifier can access only in sub classes and within the same package
	protected int a3 = 3;
	protected String b3 = "protected variable";
	protected int v = 8;

	public static void main(String[] args) {
		DeclaredAsProtected pro = new DeclaredAsProtected();
		System.out.println(pro.a3);
		System.out.println(pro.b3);
		System.out.println(pro.a3);
		System.out.println();
		System.out.println(pro.b3);

	}

}
