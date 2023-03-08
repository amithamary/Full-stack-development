package Array;
import java.util.Scanner;
public class cumulativesum{
   public static void main(String[] args) {
	  Scanner s = new Scanner(System.in);
	  System.out.println("enter the size of the array");
      int length = s.nextInt();
      int [] array = new int [length];
      int [] cumulativesum = new int [length];
      int sum = 0;
      System.out.println("enter the elements to the array");
      for (int i = 0; i <length; i++) {
    	 array[i]=s.nextInt();
         sum += array[i];
         cumulativesum[i] = sum; 
      }
      System.out.println("Cumulative sum is ");
      for (int i = 0; i <length; i++) {
       System.out.println(cumulativesum[i]+ " ");
      }
   }
}