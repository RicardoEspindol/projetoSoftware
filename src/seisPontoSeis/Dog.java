package seisPontoSeis;

 public class Dog extends Animal {
	private String nome;
	 public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void greets() {
	        System.out.println("Woof!");
	    }

	    public void greets(Dog another) {
	        System.out.println("Woooooooooof!");
	    }
}
