package seisPontoSeis;

public class BigDog extends Dog {
	
	public BigDog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void greets() {
		System.out.println("Woow!");
	}
	   
	@Override
	public void greets(Dog another) {
		System.out.println("Woooooowwwww!");
	}
}