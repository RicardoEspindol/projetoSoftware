package seisPontoSeis;

public class TestAnimal {
	public static void main(String[] args) {
	      // Using the subclasses
	      Cat cat1 = new Cat("ssdsdsdsdsddsd");
	      cat1.greets();
	      Dog dog1 = new Dog("dsdsd");
	      dog1.greets();
	      BigDog bigDog1 = new BigDog("sd");
	      bigDog1.greets();
	       
	      // Using Polymorphism
	      Animal animal1 = new Cat("caio");
	      animal1.greets();
	      Animal animal2 = new Dog("dan");
	      animal2.greets();
	      Animal animal3 = new BigDog("kkk");
	      animal3.greets();
	      // Animal animal4 = new Animal(); // Error!!! Animal is abstract; cannot be instantiated !
	      
	      // Downcast
	      Dog dog2 = (Dog)animal2;
	      BigDog bigDog2 = (BigDog)animal3;
	      Dog dog3 = (Dog)animal3;
	      // Cat cat2 = (Cat)animal2; // Error!!! Dog cannot be cast to Cat !
	      dog2.greets(dog3);
	      dog3.greets(dog2);
	      dog2.greets(bigDog2);
	      bigDog2.greets(dog2);
	      bigDog2.greets(bigDog1);
	 }
}
