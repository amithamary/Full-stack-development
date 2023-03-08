package Demo;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		customer ab = new customer(1234,"Ami","ami35425@gmail.com");
		Savingaccount s1 = new Savingaccount(54455345,ab,4000.0,1000.0);
		Scanner sc = new Scanner(System.in);
		double amount = sc.nextDouble();
		System.out.println(s1.withdraw(amount));
	}

}
