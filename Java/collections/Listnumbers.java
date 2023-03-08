package collections;
import java.util.*;
public class Listnumbers {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		System.out.println("enter the elements");
		int i,j, flag=0;
		for(i=0;i<10;i++) {
			Scanner s = new Scanner(System.in);
			list.add(s.nextInt());
		}
		for(i=0;i<10;i++) {
			for(j=1;j<10;j++) {
				if((list.get(i) + list.get(j)) == 25) {
					System.out.println(list.get(i)+ " " +list.get(j));
					flag = 1;
					break;
				}
			}
			if(flag==1)
				break;
		}

		
		if (flag == 1) {
			System.out.println("Number is valid");
		}
		else {
			System.out.println("Number is invalid");
		}
	}

}
