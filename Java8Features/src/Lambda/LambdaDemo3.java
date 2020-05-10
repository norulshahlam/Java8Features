package Lambda;
/*
usually to implement a method (WITH PARAMETER) from interface, we have to create another class, implements the interface, then defining the method
but if the interface has only 1 method, we just define the method right after creating the obj ref using :
1. anonymous inner class
2. lambda expression
u can use this if the interface has 1 abstract method ie functional interface
*/
interface B{
	void show(); //not yet implemented
}

public class LambdaDemo3 {

	public static void main(String[] args) {

		/* this is just reference of A, but not an object. and since A is reference of interface with has only 
		 * 1 method, this interface is known as interface, which can be implemented right away using below examples..
		 */
		B obj; 
		
		//1. using anonymous inner class
		obj = new B() { //everything is defined here instead of having to create another class that implements it and defined it
			public void show() { 
				System.out.println("in show, normal definition");
			}
		}; 
		obj.show();
		
		//2. using lambda. note that this is not inner class. this is implementing right away
		obj = () -> System.out.print("in show, using lambda"); //everything is defined here instead of having to create another class that implements it and defined it
		obj.show();
	}
}