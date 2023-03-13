package ustbatchnumber3.Testng;

import org.testng.Assert;
import org.testng.annotations.Test;


public class EmployeeTest{
	@Test
	public void testforemployee(){
		Employee e = new Employee("Amitha",25,"CS");
		Assert.assertEquals(e.getName(), "Amitha");
		Assert.assertEquals(e.getAge(),25);
		
	}
}