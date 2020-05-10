package StreamApi;
/*
how stream is useful.
we will show what is sum method how to implement
this as method reference
 */
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class SumMethod {

	public static void main(String[] args) {

		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		//the initial method. map.reduce()
		System.out.println(values.stream().map(i -> i*2).reduce(0,(c,e) -> c+e));
		
		/* we will replace this code with sum(), from Integer class. gives same results.
		   this means in reduce(), take the 2 arguments and use sum() from Integer class to 
		   sum all up
		 */
		System.out.println(values.stream().map(i -> i*2).reduce(0,(c,e) -> Integer.sum(c, e)));
		
		//gives same results. sum method as method reference
		System.out.println(values.stream().map(i -> i*2).reduce(0, Integer::sum));
	}
}