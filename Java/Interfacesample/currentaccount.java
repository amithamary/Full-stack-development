package Interfacesample;

public class currentaccount extends Account implements maintenancecharge{

	public currentaccount(String accountNumber, String customerName, double balance) {
		super(accountNumber, customerName, balance);
		
	}
	@Override
	public float calculatemaintenancecharge(float noofyears) {
		return ((50 * noofyears)+ 50)
		
	}
	
	}
	


