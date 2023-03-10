package ustbatchnumber3.junit5testcase;

import java.util.*;

/*public class Testvehicle{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the vehicle number: ");
    String vehicleNumber = scanner.nextLine();

    String stateCode = vehicleNumber.substring(0, 2).toUpperCase();
    String state = getStateFromCode(stateCode);

    if (state == null) {
      System.out.println("State not found for the given vehicle number");
    } else {
      System.out.println("State: " + state);
    }
  }

  private static String getStateFromCode(String code) {
    HashMap<String, String> stateCodes = new HashMap<>();
    stateCodes.put("AP", "Andhra Pradesh");
    stateCodes.put("AR", "Arunachal Pradesh");
    stateCodes.put("AS", "Assam");
    stateCodes.put("BR", "Bihar");
    stateCodes.put("CG", "Chhattisgarh");
    stateCodes.put("GA", "Goa");
    stateCodes.put("GJ", "Gujarat");
    stateCodes.put("HR", "Haryana");
    stateCodes.put("HP", "Himachal Pradesh");
    stateCodes.put("JK", "Jammu and Kashmir");
    stateCodes.put("JH", "Jharkhand");
    stateCodes.put("KA", "Karnataka");
    stateCodes.put("KL", "Kerala");
    stateCodes.put("MP", "Madhya Pradesh");
    stateCodes.put("MH", "Maharashtra");
    stateCodes.put("MN", "Manipur");
    stateCodes.put("ML", "Meghalaya");
    stateCodes.put("MZ", "Mizoram");
    stateCodes.put("NL", "Nagaland");
    stateCodes.put("OD", "Odisha");
    stateCodes.put("PB", "Punjab");
    stateCodes.put("RJ", "Rajasthan");
    stateCodes.put("SK", "Sikkim");
    stateCodes.put("TN", "Tamil Nadu");
    stateCodes.put("TS", "Telangana");
    stateCodes.put("TR", "Tripura");
    stateCodes.put("UK", "Uttarakhand");
    stateCodes.put("UP", "Uttar Pradesh");
    stateCodes.put("WB", "West Bengal");

    return stateCodes.get(code);
  }
}*/ 
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class Testvehicle {
	@Test
    public void testValidVehicleNumber() {
		
		String vehicleNumber ="KL38F5143";
	    Vehicle vh= new  Vehicle (vehicleNumber); 
	    String state =  vh.getState();
        String district =vh.getDistrict();
        assertEquals("Kerala", state);
        assertEquals("idukki", district);
    }
	    
	}