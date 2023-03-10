package ustbatchnumber3.junit5testcase;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Testvowelcount {
			 @Test
			 public void counttesting() {
			 String input ="amitha";
			 int expected=3;
			 int actual=Countvowels.vowelscount(input);
			 assertEquals(expected,actual);
			 }

}
	



