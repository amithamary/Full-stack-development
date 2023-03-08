package list;
import java.util.*;
import java.util.stream.Collectors;
public class Names {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		s.nextLine();
		System.out.println("Enter the string:");
		//str = str.toLowerCase();
		String arr[] =str.split("[?,!;: ]");
		List<String> list = Arrays.asList(str);
		//System.out.println(str);
		List<String> words = list.stream().filter(t->!t.isEmpty()).collect(Collectors.toList());
		List<String> unique = words.stream().map(val->val.toLowerCase()).distinct().sorted().collect(Collectors.toList());
		System.out.println(words.size());
		System.out.println(unique);
	}

	
}
