package collections.list.anvesh;

import java.util.ArrayList;
import java.util.List;

public class Listanvesh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor P1 = new Professor(101, "michael", "CSE");
		Professor P2 = new Professor(102, "John", "IT");
		Professor P3 = new Professor(103, "Vikram", "EEE");
		
		List list=new ArrayList();
		list.add(P1);
		list.add(P2);
		list.add(P3);
		System.out.println(list.get(2));
	}

}
