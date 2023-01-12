package doisPontoCinco;

public class Customer {
	private int id;
	private String name;
	private char gender;
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public char getGender() {
		return gender;
	}

	public Customer(int id, String name, char gender) {
		this.id = id;
		this.name = name;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return  name+" ("+id+")";
	}
	
}
