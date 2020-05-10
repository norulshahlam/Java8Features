package DefaultMethod;
/*
we show here that interface can be defined within the interface itself, without
using another class. both way can be achieved
we understand that this is useful when user need to modify interface sometime later.
eg if there are 10 classes implementing interface of 2 methods. n in future user 
needs to add 1 more method in interface so this gives error in which this 10 classes
needs to define this new method. imagine having 100 class implementing. to overcome this,
java 8 has keyword 'default' where user can implement in interface so the 10 classes 
dont need to define this additional method
 */
interface d{
	default void show(){ //method is defined here by using default keyword
		System.out.println("showing in interface a");
	}
	void eat(); //method will be implemented later upon implemented
	
	//in future if i 1 2 add a method, i can use default keyword so the classes that implements this interface dont need to define.
	default void newMethod(){
		System.out.println("sorry guys i am new here so dont need to implement me cos i have 'default' keyword");
	}
}

public class DefaultDemo implements d{

	public void eat() { //this is implemented here, out of the main String class
		System.out.println("eating in interface a");
	}
	
	
	
	
	
	public static void main(String[] args) {
		DefaultDemo d = new DefaultDemo();
		
		d.show(); //this is already implemented earlier
		d.eat(); // this was implemented in class
	}		
}
