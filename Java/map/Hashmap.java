package map;
import java.util.*;
public class Hashmap {

	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
		map.put("Akhil", 26);
		map.put("Devi", 23);
		map.put("Meenu",29);
		System.out.println(map);
		
		int age = map.get("Meenu");
		System.out.println("Age is" + " " + age);
		map.remove("Akhil");
		System.out.println(map);
	}

}
