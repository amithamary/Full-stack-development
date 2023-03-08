package collections;
import java.util.*;
public class Arrayex {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ami");
		list.add("Akhil");
		list.add("Meenu");
		list.add("Devika");
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
