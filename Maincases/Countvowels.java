package ustbatchnumber3.junit5testcase;

public final class Countvowels {

	public static void main(String[] args) {
		String str="Amitha";
		System.out.println("Total count:" + "" + vowelscount(str));

	}

	public static int vowelscount(String input) {
		String str = input.toLowerCase();
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u' ) {
				count++;
			}
		}
		return count;
	}

}
