package java8;



@FunctionalInterface
public interface employee {
	
//	a functional interface can have mutiple default and static methods buth can jhave only one abstract method
	
	
//	this is a abstract method
	public void getSalary();
	
//	this is a default method
	default void getName() {
		System.out.println("employee name");
	}
	
//	creating a static method
	public static void Printdetails() {
		System.out.println("ptinting employee details");
	}
}
