package list;
import java.util.*;
class Details {
	String Id;
	String Name;
	double Salary;
	public Details(String id, String name, double salary) {
		super();
		this.Id = Id;
		this.Name = Name;
		this.Salary = Salary;
	}
	
	
	public void setDetailsSalary(double salary){

		this.Salary = Salary;


	}
}
class Main {
	public static void main(String[] args) {
		Details e1 =new Details("345","Ann",250000);
		Details e2 =new Details("456","Ben",350000);
		Details e3 =new Details("745","Chen",450000);
		Details e4 =new Details("845","Eun",550000);
		
		List<Details> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		Comparator<Details> compareSalary = new Comparator<>();
			@Override
			public int compare(Details a1, Details a2) {
				if(a1.Salary < a2.Salary)
					return 1;
				else
					return -1;
			}
	        };
		Collection.sort(list), compareSalary);
		System.out.println("Last Salary");
		for(Details e:list) {
			System.out.println(e.Name + ":" + e.Salary);
		}
		System.out.println("---");
		for(Details e:list) {
			if(e.Salary>=50000 & e.Salary<=100000) {
				e.setSalary((e.Salary +(e.Salary*10)/100));
			} else if(e.Salary<50000) {
				e.setSalary(e.Salary);
			} else if(e.Salary<100000) {
				e.setSalary((e.Salary+e.Salary*5)/100));
			}
		}
		System.out.println("Current Salary");
		for(Details e:list) {
			System.out.println(e.Name +":" +e.Salary);
		}
}
}

