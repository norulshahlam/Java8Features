package StreamApi;
/*
we will show step-by-step how map.reduce works by slowly simplifying the codes
 */
import java.util.Arrays;
import java.util.List;

public class MapReduce2 {

	public static void main(String[] args) {

		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		//	we will see how this code works
		System.out.println(values.stream().map(i -> i*2).reduce(0,(c,e) -> c+e));
		
		
		
		/* BLOCK 1
		//	1. create obj of function with definition using lambda
		Function<Integer, Integer> f = new Function<Integer, Integer>(){

			@Override
			public Integer apply(Integer t) {
				
				return t*2;
			}
			
		};
		
		//	2. create obj of binary operator with definition using lambda
		BinaryOperator<Integer> b = new BinaryOperator<Integer>(){
			public Integer apply (Integer i, Integer j){
				return i+j;
			}
		};
		//	3. create obj of stream
		Stream<Integer> s = values.stream(); 
		
		//	4. create obj of stream with reference of map that takes obj of function
		Stream<Integer> s1 = s.map(f);
		
		//	5. create obj of integer with reference of reduce that takes obj of BinaryOperator, and cast it
		Integer result = (Integer) s1.reduce(0,b);
		
		//print obj of result
		System.out.println(result);
		END OF BLOCK 1 */
		
		
		/* BLOCK 2
		//	1. create obj of stream
		Stream<Integer> s = values.stream(); 
		
		//	2.	instead of creating obj of function f for the map reference input, take the implementation of f and insert into the map reference directly
		Stream<Integer> s1 = s.map(new Function<Integer, Integer>(){
	
			public Integer apply(Integer t) {
				
				return t*2;
			}		
		});
		
		//	3.	instead of creating obj of BinaryOperator b for the reduce reference input, take the implementation of b and insert into reduce map reference directly
		Integer result = (Integer) s1.reduce(0,new BinaryOperator<Integer>(){
			public Integer apply (Integer i, Integer j){
				return i+j;
			}
		});
		
		//print obj of result
		System.out.println(result);
		END OF BLOCK 2 */
		
		
		
		/* BLOCK 3
		//	1. create obj of stream
		Stream<Integer> s = values.stream(); 
		
		//	2.	since this is func interface, we can remove boiler plate codes
		Stream<Integer> s1 = s.map( i -> i*2);
		
		//	3.	since this is func interface, we can remove boiler plate codes
		Integer result = (Integer) s1.reduce(0,( i, j) -> i+j);
		
		//print obj of result
		System.out.println(result);
		
		END OF BLOCK 3 */
		
		
		/* BLOCK 4
		//	2.	replace i, j with c,e. this is more logical. c is carry, e is value
		//	3. 	replace s & s1 directly here as the input, instead of defining them first 
		Integer result = (Integer) values.stream().map( i -> i*2).reduce(0,( c, e) -> c+e);
		
		//print obj of result
		System.out.println(result);
		
		END OF BLOCK 4 */
		
		//instead of printing result, replace that variable with the implementation of it. this code is the same as the beginning
		
		System.out.println(values.stream().map( i -> i*2).reduce(0,( c, e) -> c+e));
	}
}
