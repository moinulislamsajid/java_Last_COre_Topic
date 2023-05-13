package Exception_Handling;

public class Exception_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int x = 15;
			int y = 0;
			int result = x/y;
			System.out.println("Result : "+result);

		} catch(NullPointerException e) {
			System.out.println("Exception : "+e);
		} catch(Exception op) {
			System.out.println("Exception : "+op);
		}
		finally {
			System.out.println("Last Line of Program");
			int x2 = 10;
			int y2 = 20;
			int hey = x2 + y2;
			System.out.println("Here Result : "+hey);

		}
		try {
			int[] number = new int[3];
			number[4] = 10;
		}catch(ArithmeticException ss) {
			System.out.println("Exception : "+ss);
		}catch(Exception f) {
			System.out.println("Exception : "+f);
		}
		finally {
			System.out.println("This for last change");
		}
		
	}
		
	

	

}
