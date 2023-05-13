package ToString_Method;

public class persion {
	String name;
	int age;
	persion(String name,int age){
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return "Name : "+name + "\n"+"Age " +age;
	}

}
