package ThirdRule;

/*
this shows that if there is 2 same method - 1 is inherited, 1 implemented,
compiler will prefer the inherited BECAUSE class has more power than interface
this is also called as third rules in java
below shows a class having show(); and interface having show(); and compiler prints 
show(); from class A
 */
class A{
	public void show(){
		System.out.println("in Class A");
	}
}

interface B{
	default void show(){ //in java 8, u can implement a method in interface by using default keyword
		System.out.println("in Interface B");
	}
}

class C extends A implements B{
	
}

public class ThirdRule  {

	public static void main(String[] args) {
		
		C c = new C();
		c.show();
	}

}
