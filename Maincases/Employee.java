package ustbatchnumber3.junit5testcase;
import java.text.SimpleDateFormat;
import java.util.*;
public class Employee {

	public static void main(String[] args) {
		Employee o=new Employee();
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		System.out.println(o.gettingCoins(25));

	}
	
	public static int gettingCoins(int n)
	{
		if(n>=1&&n<=80)
		{
			return 5;
		}
		else if(n>=81&&n<=172)
		{
			return 3;
		}
		else if(n>=172&&n<=266)
		{
			return 1;
	    }
		else
		{
			return 0;
		}

}
}

