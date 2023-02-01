package collections.list.deva;

public class Person {
	int id;
	String name;
	String eductaion;
	String workplace;

	public Person(int id, String name, String eductaion, String workplace) {

		this.id = id;
		this.name = name;
		this.eductaion = eductaion;
		this.workplace = workplace;
	}

	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", eductaion=" + eductaion + ", workplace=" + workplace + "]";
	}

}
