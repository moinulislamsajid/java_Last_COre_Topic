package Abstraction;

public class Abstarction_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//interface variable 
		Student stu;
		stu = new Teacher();
		stu.info();
		stu = new Farmer();
		stu.info();
	}

}
