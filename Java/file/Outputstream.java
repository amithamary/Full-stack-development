package file;
import java.io.*;
public class Outputstream {

	public static void main(String[] args) {
		try {
		String s = "This is a test line";
		FileOutputStream fout= new FileOutputStream("D:\\testout.txt");
		byte b[]=s.getBytes();
		fout.write(b);
		fout.close();
		System.out.println("Success");
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}


	}

}
