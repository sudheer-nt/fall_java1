package stringclass.charan;

public class UsingString {

	public static void main(String[] args) {

		String s1 = "string is the key";
		String s2 = "string is the key";
		String s3 = new String("string is the key");
		
		if(s2.equals(s3))
		{
			System.out.println("both are equal");
		}
		else
		{
			System.out.println("both are not equal");
		}
		
		System.out.println(s1.concat(" = " +s3));
		System.out.println(s1.charAt(1));//to get specified index
		System.out.println(s1.equals(s3));// to get boolean value		
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.startsWith(s3));
		
		
		
		
	}

}
