package list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class evensquare {

	public static void main(String[] args) {
		List<Integer> s = Arrays.asList(4,6,8,9);
		List<Integer> squarelist = s.stream().filter(t->t%2==0).map(t->t*t).collect(Collectors.toList());
		System.out.println(squarelist);

	}

}
