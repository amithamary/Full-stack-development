package Demo;

public class Savingaccount extends Account {
	protected double minimumBalance;
	
	public Savingaccount(int accountnumber, customer customerObject, double balance, double minimumBalance) {
		super(accountnumber, customerObject, balance);
		this.minimumBalance = minimumBalance;
	}

public boolean withdraw(double amount) {
	if(balance - amount > minimumBalance)
	{
		balance = balance - amount;
		return true;
	}
	else {
		return false;
	}
}	

}
