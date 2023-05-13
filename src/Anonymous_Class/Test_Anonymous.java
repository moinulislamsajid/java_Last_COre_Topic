package Anonymous_Class;

public class Test_Anonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalAnonymous ob = new LocalAnonymous() {
			@Override
			void display() {
				System.out.println("THis is OverRide Anonymous CLass");
			}
			
		};
		
        ob.display();
	}

}
