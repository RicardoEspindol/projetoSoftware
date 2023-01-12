package seisPontoSeis;

abstract public class Animal {
	private String name;
	
	public abstract void greets();

	public Animal(String name) {
		this.name = name;
	}
}
