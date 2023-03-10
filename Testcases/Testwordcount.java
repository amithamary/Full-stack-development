package ustbatchnumber3.junit5testcase;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Testwordcount {
	@Test
	public void countTesting() {
		List<String> words=Arrays.asList("amitha","devika","amitha","devika","meenu","amitha","meenu","meenu");
		int count=3;
		int actual=Wordcount.countwords(words);
		assertEquals(count,actual);
	}
}
