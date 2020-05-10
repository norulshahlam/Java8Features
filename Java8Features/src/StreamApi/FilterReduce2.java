package StreamApi;
/*
based on earlier class,we will breakdown what the expression means
also show what is findFirst() & orElse()
what is optional?
 */
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilterReduce2 {

	public static void main(String[] args) {

		List<Integer> values = Arrays.asList(12, 20, 35, 46, 55, 68, 75);
	
	
		/* convert list into streams
		 * then convert into filter() where it removes elements not divisible by 5
		 * then sum the remaining elements	*/
		System.out.println(values.stream().filter(i->i%5==0).reduce(0,(c,e)->c+e));
		
		/*	how it works	*/
		
		
		
		/*	creating the object p	
		 * 	Predicate is a functional interface which accepts 1 argument,
		 * 	having a method test() that returns a boolean value
		 * 	only return if element is divisible by 5*/
		Predicate<Integer> p = new Predicate<Integer>(){
			public boolean test(Integer i){
				return i%5==0;
				
			}
		};
		
		
		/*	1. filter() the stream values that was converted
		 * filter takes in object 'p' which is of type predicate		*/
		System.out.println(values.stream().filter(p).reduce(0,(c,e) -> c+e));
		
		
		/*	we can also find the first element after filtering it instead of total up
		 *  this is give the result as optional, a feature in java 8
		 *  basically if you dont have any result, it wont give u exception
		 *  but give something	*/
		System.out.println(values.stream().filter(p).findFirst());
		
	}
}