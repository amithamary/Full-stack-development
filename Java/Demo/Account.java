package Demo;

abstract public class Account {
	protected int accountnumber;
	protected customer customerObject;
	protected double balance;
	
	public Account(int accountnumber,customer customerObject, double balance) {
		super();
		this.accountnumber = accountnumber;
		this.customerObject = customerObject;
		this.balance = balance;
	}

	abstract public boolean withdraw(double amount);


}