package list;
import java.util.*;
import java.util.stream.Collectors;
class Customers {
	int Registerid;
	String Name;
	String Phoneno;
	String Emailid;
	String Location;
	

	public Customers(int registerid, String name, String phoneno, String emailid, String location) {
		super();
		Registerid = registerid;
		Name = name;
		Phoneno = phoneno;
		Emailid = emailid;
		Location = location;
	}

	public int getRegisterid() {
		return Registerid;
	}


	public void setRegisterid(int registerid) {
		Registerid = registerid;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
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


	public String getLocation() {
		return Location;
	}


	public void setLocation(String location) {
		Location = location;
	}
}
class Customerdetails {
	public static void main(String[] args) {
		Customers e1 =new Customers(345,"Ann","8956636564","ann46464@gmail.com","gcc");
		Customers e2 =new Customers(456,"Ben","8956636564","ann46464@gmail.com","gghvc");
		Customers e3 =new Customers(745,"Chen","8956636564","ann46464@gmail.com","awc");
		Customers e4 =new Customers(845,"Eun","8956636564","ann46464@gmail.com","nnjk");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		List<Customers> list = Arrays.asList(e1,e2,e3,e4);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		List<Customers>w=a.stream().filter(t->t.getRegisterid()==id).collect(Collectors.toList());
		//for (CustomersDetails)
	}
}
