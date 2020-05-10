package StreamApi;

/*
how stream is useful.
whats the diff using stream and normal iterations to print List
how to use stream and how it works?
 */
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class MapReduce {

	public static void main(String[] args) {

		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);

		int result = 0;

		/*
		 * for this process we will multiply each element into 2 AND THEN sum
		 * all of it. this method here is called mutation where a variable is
		 * continuously changed many times. many mutation to a variable can
		 * result in not achieveing concurrency
		 */

		for (int i : values)
			result = result + i * 2;
		System.out.println("enhanced loop: " + result);

		
		
		
		/* instead we use stream. first it converts collection into stream. then
		 * will pass to method map, which will we define to multiply the value
		 * of each streams to 2 then with this output, we will use reduce() to
		 * sum it up		 */
		System.out.print("lambda expression: ");
		System.out.println(values.stream().map(i -> i * 2).reduce(0, (c, e) -> c + e));

		
		
		/* how it works? this is the breakdown, before simplification */

		
		/*	3. this is where we create the object 'f' which has a method
			defined that multiply each stream values into 2. this is used
			as input for map()		 */
		Function<Integer, Integer> f = new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer t) {
				return t * 2;
			}
		};

		
		
		/* 4. this is the part where we create object 'b' that has the method defined
		 * that will total up the stream values. this object will be used as input for reduce() */
		BinaryOperator<Integer> b = new BinaryOperator<Integer>() {
			public Integer apply(Integer i, Integer j) {
				return i + j;
			}
		};

		/* 1. convert the list values into stream 's' */
		Stream<Integer> s = values.stream();

		/* 2. Returns an {@code IntStream} consisting of the results of applying
		 * the given function to the elements of this stream. map will convert s
		 * and take f as the logic reference (ie multiply each value into two). 
		 * and gives the output s1 which is a stream type.		 */
		Stream<Integer> s1 = s.map(f);

		
		
		/*	5. then reduce() will convert s1 using 'b' as the logic reference defined earlier
		 *  (ie add all values). how this works: 
		 *  stream values of s1=2,4,6,8,10,12
		 *  1st value: 0, b=2
		 *  this input goes to BinaryOperator, adds 0+2 returns 2. 
		 *  then next iteration, 2 will be the initial value,
		 *  then 2, b=4, goes to BinaryOperator, adds 2+4 returns 4. 
		 *  then next iteration, 4 will be the initial value,
		 *  then 4, b=6, goes to BinaryOperator, adds 4+6 returns 10. 
		 *  and so on...
		 *	this will give the output 'result' which we will cast it into Integer	*/
		Integer result2 = (Integer) s1.reduce(0, b);
		System.out.println("explained: "+result2);
	}

}
