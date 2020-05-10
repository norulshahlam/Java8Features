package ForEach;
/*
we demo how to use forEach. while doing some simple manipulation eg double all numbers before printing it
here we show there are several way to print the values by using loops
forLoop and enhanced forLoops are called external loops while
forEach is called internal loops
with forEach, we can iterate over a collection and perform a given action on each element, like any other Iterator.
 */
import java.util.Arrays;
import java.util.List;

public class Loops {

	public static void main(String[] args) {

		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5);

		
		values.forEach(i -> System.out.println(i*2));
	}
		

}
