package FIle_Create;
import java.util.Formatter;
import java.util.Scanner;
public class File_Write {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name,uni_name;
		try {
			Formatter file_Write = new Formatter("C:/Users/Sajid/eclipse-workspace/Abstraction/Ayman Sajid/Student.txt");
			Scanner input = new Scanner(System.in);
			System.out.print("How Many Student : ");
			int num = input.nextInt();
			
		for(int i =1; i<=num;i++) {
			System.out.print("Enter Student name and university name : ");
			name = input.nextLine();
			uni_name = input.nextLine();
			file_Write.format("%s %s\r\n",name,uni_name);
			
			
		}
		
			file_Write.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
