package list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Square {

	public static void main(String[] args) {
		List<Integer> s = Arrays.asList(4,6,8,9);
		List<Integer> squarelist = s.stream().map(t->t*t).collect(Collectors.toList());
		System.out.println(squarelist);
	}

}
