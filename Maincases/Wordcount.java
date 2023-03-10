package ustbatchnumber3.junit5testcase;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
public class Wordcount {

	public static void main(String[] args) {
		List<String> words=Arrays.asList("amitha","devika","amitha","devika","meenu","amitha","meenu","meenu");

	
}
	public static int countwords(List words) {
		Set<String> names=new HashSet<String>(words);
		for(String key:names) {
			System.out.println(key +"" + Collections.frequency(words,key));
		}
		return countwords(null);
		
}
}

/* Or 
 public class listcount {
	public static void main(String[] args) {
		
		List<String> l1=Arrays.asList("as","df","as");
		long dupe=l1.stream().filter(name->name.equalsIgnoreCase("as")).count();
		System.out.println(dupe);
		
	}

}
*/