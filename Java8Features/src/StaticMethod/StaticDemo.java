package StaticMethod;
/*
this is to show that static method in interface can be called right away in main method
 */
interface i{
	
	static void show(){ //here is the static method, implemented.
		System.out.println("interface i");
	}
}

public class StaticDemo implements i{

	public static void main(String[] args) {
		
		//here u can straight away call a method in interface i if it is declared as static. 
		i.show();
	}
}
