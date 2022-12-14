package accessmodifierscharanpackage;

public class DeclartionAsPublic extends DeclaredAsProtected{

	public static int a1 = 1;
	public static String a2 = "string as public";
	
	public int a7 = 0;
	public String a8 = "string as public";


	public static void main(String[] args) {
		
		DeclartionAsPublic pub = new DeclartionAsPublic();
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println("side ");
		System.out.println(pub.b3);

		
		System.out.println(pub.a7);
		System.out.println(pub.a8);
	}

}
