package java8;

public class Main {
	public static void main(String []args) {
		
//		helps us to use interface directly without creating a implemanting class but the interface must be functional
//		that is it must have exactly one abstract method not more than this not less than this
		employee e = ()-> System.out.println("salary is 10000");
		e.getSalary();
		
		
//		getname is defult method it could be used by the instance
		e.getName();
		
		
//		the static method is can be called only by the name of the interface that contains the mathod as e is a implementing class it will give error
//		a static method is not visible any other class
		employee.Printdetails();
	}
}
