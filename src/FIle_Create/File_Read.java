package FIle_Create;

import java.io.File;
import java.util.Scanner;

public class File_Read {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		File fi_read = new File("C:/Users/Sajid/eclipse-workspace/Abstraction/Ayman Sajid/Student.txt");
		Scanner hey_read = new Scanner(fi_read);
		while(hey_read.hasNext()) {
			String name = hey_read.next();
			String uni_name = hey_read.next();
			System.out.println("Name :"+name + "Uniname : "+uni_name);
		}
		hey_read.close();
		

	}catch(Exception e) {
		System.out.println(e);
	}

}
}
