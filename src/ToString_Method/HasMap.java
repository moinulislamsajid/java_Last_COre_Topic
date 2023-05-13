package ToString_Method;
import java.util.HashMap;
public class HasMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Integer,String> customer = new HashMap <Integer,String>();
		// here put information retain here 
		customer.put(101, "Ayman Sajid");
		customer.put(102, "Samiur Sakib");
		customer.put(103, "Mujibur Rahman");
		customer.put(104, "Rebeka Akther");

		// here get here information print here
		
		System.out.println(customer.get(102));
		System.out.println(customer.get(101));

		

		

	}

}
