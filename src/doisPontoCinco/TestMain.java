package doisPontoCinco;

public class TestMain {

	public static void main(String[] args) {
		Customer c1 = new Customer(1,"Ricardo",'m');
		Customer c2 = new Customer(2,"Otávio",'f');
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("ID = "+ c1.getId());
		System.out.println("NAME = "+ c1.getName());
		System.out.println("GENDER = "+ c1.getGender());
		
		Account a1 = new Account(5,c1, 15.45);
		Account a2 = new Account(7,c2, 987.45);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println("ID = "+ a1.getId());
		System.out.println("CUSTOMER = "+ a1.getCustomer());
		System.out.println("BALANCE = "+ a1.getBalance());
		System.out.println(a1.getCustomerName());
		a1.deposit(55.20);
		System.out.println(a1);
		a1.withdraw(55.20);
		System.out.println(a1);
		
		
		
	}

}
