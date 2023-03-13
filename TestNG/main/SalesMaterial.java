package ustbatchnumber3.Testng;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import java.util.Arrays;
import java.util.List;

public class SalesMaterial {
    private String nameOfCity;
    private double priceWithMaterial;
    private double priceWithoutMaterial;

    public SalesMaterial(String nameOfCity, double priceWithMaterial, double priceWithoutMaterial) {
        this.nameOfCity = nameOfCity;
        this.priceWithMaterial = priceWithMaterial;
        this.priceWithoutMaterial = priceWithoutMaterial;
    }
    public String getNameOfCity() {
        return nameOfCity;
    }
    public double getPriceWithMaterial() {
        return priceWithMaterial;
    }

    public double getPriceWithoutMaterial() {
        return priceWithoutMaterial;
    }
    public List getThePriceOnSquareFeet(double squareFeet) {
        double priceWithM = squareFeet * getPriceWithMaterial();
        double priceWithoutM = squareFeet * getPriceWithoutMaterial();
        return Arrays.asList(priceWithM, priceWithoutM);
    }
}
/*import java.util.Collections;
import java.util.List;
import java.util.Scanner;
class Companydetails{
	private String cities;
	private int price_with_material;
	private int price_without_material;
	public Companydetails(String cities, int price_with_material, int price_without_material) {
		super();
		this.cities = cities;
		this.price_with_material = price_with_material;
		this.price_without_material = price_without_material;
	}
	public String getCities() {
		return cities;
	}
	public void setCities(String cities) {
		this.cities = cities;
	}
	public int getPrice_with_material() {
		return price_with_material;
	}
	public void setPrice_with_material(int price_with_material) {
		this.price_with_material = price_with_material;
	}
	public int getPrice_without_material() {
		return price_without_material;
	}
	public void setPrice_without_material(int price_without_material) {
		this.price_without_material = price_without_material;
	}


	public double totalprice(int sqft) {
		return ((sqft*price_with_material)+(sqft*price_without_material));
	}
}


public class Company {
	
	public static void main(String[] args) {
		List<Companydetails> list=Collections.emptyList();
		Companydetails c1 = new Companydetails("Tvm",1600,800);
		Companydetails c2 = new Companydetails("Chennai",1800,1000);
		Companydetails c3 = new Companydetails("Hyderabad",2000,900);
		Companydetails c4 = new Companydetails("Mumbai",2500,1200);
		Companydetails c5 = new Companydetails("Kochi",1800,1200);
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		list.add(c5);
		System.out.println("Enter a city");
		Scanner sc = new Scanner(System.in);
		String city= sc.nextLine();
		System.out.println("Enter the square feet");
		int sqft = sc.nextInt();
		//double totalprice = list.Stream().filter(val->val.getCities().equals("Kochi")).map(val->val.totalprice(sqft));
		//double totalPrice = list.stream().filter(val -> val.getCities().equals("Kochi")).mapToDouble(val -> val.totalprice(sqft)).sum();
		System.out.println("Total" + " " + totalPrice);
		
	}

}*/
