package ForEach;
/*
we demo how forEach works. 
understand that forEach is a consumer interface when where is the link

 */
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class HowItWorks {

	public static void main(String[] args) {

		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5);

		// 1st step: creating consumer interface and implementing using anonymous inner class
		Consumer<Integer> c = new Consumer<Integer>() {
			public void accept(Integer i) {
				System.out.println("in c: " + i);
			}
		};

		// 2nd step: since consumer is a functional interface, we can remove boiler plate codes and add lambda exp.
		Consumer<Integer> d = (Integer i) -> {
			System.out.println("in d: " + i);
		};
		
		// 3rd step: integer can be declared once, so the right right can be removed
		Consumer<Integer> e = (i) -> {
			System.out.println("in e: " + i);
		};
		
		// 4th step: since the statement is only one line, no need for curly braces
		Consumer<Integer> f = (i) -> System.out.println("in f: " + i);
		
		//5th step: since there is only 1 parameter, we can remove the round bracket
		Consumer<Integer> g = i -> System.out.println("in g: " + i);
		
		//final step: rather than implementing and then call, insert the implementation in the call method
		//Consumer<Integer> h = i -> System.out.println("in g: " + i); <-this definition goes right into the call method
		//values.forEach(h); <- method definition replaces the reference itself in the call method
		values.forEach(i -> System.out.println("in final: "+i));
		
		values.forEach(c);
		values.forEach(d);
		values.forEach(e);
		values.forEach(f);
		values.forEach(g);
		values.forEach(i -> System.out.println(i));
	}
}