package samplepgm;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		//int rev,temp,sum=0;
		//System.out.println("enter a number");
		//Scanner sc = new Scanner(System.in);
		 
			  int rev,sum=0,temp;    
			  int n=44;  
			  
			  temp=n;    
			  while(n>0){    
			   rev=n%10;  
			   sum=(sum*10)+rev;    
			   n=n/10;    
			  }    
			  if(temp==sum)    
			   System.out.println("palindrome number ");    
			  else    
			   System.out.println("not palindrome");    
			}  
		
	

}
