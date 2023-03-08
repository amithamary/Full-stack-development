package Array;

public class positNegat {
	private static int i;
	public static void main(String[] args) {
		int arr[] = {4,-4,6,8,-9,0,4,-7,56};
		int posicount = 0;
		int negacount = 0;
		int max = arr[0];
		for(i=1; i<arr.length;i++) {
			if(arr[i] < 0) {
				System.out.println("number is positive");
			}
			else{
				System.out.println("number is negative");
				}
				
			}
		}
				
	}

}
