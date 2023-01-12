package umPontoSeis;

public class Account {
	private String id;
	private String name;
	private int balance;
	
	//Construtores
	public Account(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	//toString
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void credit(int amount) {
		this.balance =  balance + amount;
	}
	public int debit(int amount) {
		if(amount<= balance) {
			this.balance =  balance - amount;
		}
		else {
			System.out.println("Amount exceeded balance");
		}
		return balance;
	}
	public int transferTo(Account another, int amount) {
		if(amount<= balance) {
			this.balance =  balance - amount;
			another.balance =  amount;
		}
		else {
			System.out.println("Amount exceeded balance");
		}
		return balance;
	}
	
	
	
}
