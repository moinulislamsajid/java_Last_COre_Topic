package ToString_Method;
import java.util.LinkedList;

public class linklist {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		LinkedList<String> District_Name = new LinkedList<String>();
		District_Name.add("Faridpur");
		District_Name.add("Rajbari");
		District_Name.add("Dhaka");
		District_Name.add("Magura");
		District_Name.add(1, "Cox's Bazar");
		District_Name.addFirst("Goalpara");
		District_Name.addLast("Domrakandhi");
		District_Name.remove("Magura");
		
		
	
	



		
		
		for(String x : District_Name) {
			System.out.println(x);
		}
	
		System.out.println("THe Size of Linkedlist : "+District_Name.size());
		


		

	}

}
