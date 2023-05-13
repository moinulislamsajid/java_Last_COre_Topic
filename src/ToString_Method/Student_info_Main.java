package ToString_Method;

import java.util.LinkedList;

public class Student_info_Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Stsudent Linkdelist
		LinkedList<Stsudent_Info> student = new LinkedList<Stsudent_Info>(); // linkedlist ar modda class type hoba
		// student create
		Stsudent_Info s1 = new Stsudent_Info("Ayman Sajid","four",101);
		Stsudent_Info s2 = new Stsudent_Info("Ayman Sajid","four",101);
		Stsudent_Info s3 = new Stsudent_Info("Ayman Sajid","four",101);
		Stsudent_Info s4 = new Stsudent_Info("Ayman Sajid","four",101);

		// adding display 
		
		student.add(s1);
		student.add(s2);
		student.add(s3);
		student.add(s4);
		
		// print data
		for(Stsudent_Info hey : student) { // class name hoba
			System.out.println(hey.name + " " +" "+ hey.class_name+" " + hey.id);
			
		}
	}

}
