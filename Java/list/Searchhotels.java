package list;
import java.util.*;
import java.util.stream.Collectors;
public class Searchhotels {
	int Hotelid;
	String Hotelname;
	String Location;
	String Phoneno;
	String Emailid;
	
	public Searchhotels(int hotelid, String hotelname, String location, String phoneno, String emailid) {
		super();
		this.Hotelid = hotelid;
		Hotelname = hotelname;
		Location = location;
		Phoneno = phoneno;
		Emailid = emailid;
	}
	
	public int getHotelid() {
		return Hotelid;
	}

	public void setHotelid(int hotelid) {
		Hotelid = hotelid;
	}

	public String getHotelname() {
		return Hotelname;
	}
	public void setHotelname(String hotelname) {
		Hotelname = hotelname;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public String getPhoneno() {
		return Phoneno;
	}

	public void setPhoneno(String phoneno) {
		Phoneno = phoneno;
	}

	public String getEmailid() {
		return Emailid;
	}

	public void setEmailid(String emailid) {
		Emailid = emailid;
	}
}
public class Hotels{
	public static void main(String[] args) {
		Searchhotels h1 =new Searchhotels(345,"Parady","Thissur","8955766656","parady46464@gmail.com");
		Searchhotels h2 =new Searchhotels(465,"lovedon","Ernakulam","9566365164","lovedon64@gmail.com");
		Searchhotels h3 =new Searchhotels(875,"Sfs","Trivandrum","8086365640","sfssppl464@gmail.com");
		Searchhotels h4 =new Searchhotels(235,"Flemingo","Angamaly","8956636564","flemigo46464@gmail.com");
		Searchhotels h5 =new Searchhotels(213,"Ariana","Aleppy","8132363656","arianale4@gmail.com");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		List<Hotels> list = Array
	}
	

}
