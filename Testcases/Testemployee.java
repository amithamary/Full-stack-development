package ustbatchnumber3.junit5testcase;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*import employee.Employee;*/

public class Testemployee {
	@Test
	
	public void Coins1()
	{
		String pattern = "2022-01-01";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		int input=56;
		int expected=5;
		int actual=Employee.gettingCoins(input);
		assertEquals(expected,actual);
	}
	@Test
	public void Coins2()
	{
		int input=167;
		int expected=3;
		int actual=Employee.gettingCoins(input);
		assertEquals(expected,actual);
	}
	@Test
	public void Coins3()
	{
		int input=205;
		int expected=1;
		int actual=Employee.gettingCoins(input);
		assertEquals(expected,actual);
	}
	@Test
	public void Coins4()
	{
		int input=280;
		int expected=0;
		int actual=Employee.gettingCoins(input);
		assertEquals(expected,actual);
	}

}
