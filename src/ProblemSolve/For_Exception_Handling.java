package ProblemSolve;
import java.util.Scanner;
public class For_Exception_Handling {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			try {
				Scanner input = new Scanner(System.in);
				int num1,num2;
				System.out.print("Please Enter Num1: ");
				num1 = input.nextInt();
				
				System.out.print("Please Enter  Num2 : ");
				num2 = input.nextInt();
				int result;
				result = num1/num2;
				System.out.println("Result: "+ num1+"/"+num2+" = "+result);
				
				
			}catch(Exception ee) {
				System.out.println("Exception : "+ee);
				System.out.println("You must enter an integer Try again");
			}
			
		}

	}

}
