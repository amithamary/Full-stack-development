package collections;
import java.util.*;
public class Hashset {

	public static void main(String[] args) {
		int[] arr1 =  {7,8,2,3,4,5,6,1};
		int[] arr2 = {8,44,2,3,4,6,78};
		System.out.println("Array1:" + Arrays.toString(arr1));
		System.out.println("Array2:" + Arrays.toString(arr2));
		FindCommonElements(arr1,arr2);
		
	}
	public static void FindCommonElements(int[] arr1,int[] arr2) {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		for(int i:arr1) {
			set1.add(i);
		}
		for(int i:arr2) {
			set2.add(i);
		}
		set1.retainAll(set2);
		System.out.println("Common elements:" + set1);
	}

}
