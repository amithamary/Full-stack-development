package Array;

public class maxnum {
	private static int i;

	public static void main(String[] args) {
		int arr []= {5,8,1,7,2};
		int max = arr[0];
		for(i=1; i<arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
				System.out.println("the maximum number is");
			}
		}
		

	}

}
