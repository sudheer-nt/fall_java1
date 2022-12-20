package exceptions.charan;

import java.util.*;

public class TryCatchException {

	public static void main(String[] args) {

		int i = 4;
		int j = 2;

		try {
			int k = i / j;
			System.out.println(k);
			System.out.println("try block");
		} catch (Exception e) {
			System.out.println("catch block");
		}
		
		finally {
			System.out.println("finally statement");
		}
		System.out.println("end of the statement");

	}

}
