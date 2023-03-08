package streams;
import java.util.*;

class Customerdetails {
	private int Id;
	private String Name;
	public Customerdetails(int id, String name) {
		super();
		Id = id;
		Name = name;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
}
class Food{
	String food;
	int price;
	int foodId;
	public Food(String food, int price, int foodId) {
		super();
		this.food = food;
		this.price = price;
		this.foodId = foodId;
	}
	public String getFood() {
		return food;
	}
	public void ssetFood(String food) {
		this.food = food;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getFoodId() {
		return foodId;
	}
	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}

}

public class Crudoperation {
	
	public static void main(String[] args) {
		//List<String> list = Arrays.asList(str);
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		Customerdetails c1 =new Customerdetails(55,"Ann");
		
		
		
	}

}
