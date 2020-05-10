package StreamApi;
/*
how stream is useful.
we will show what is filter.reduce() means
 */
import java.util.Arrays;
import java.util.List;

public class FilterReduce {

	public static void main(String[] args) {

		List<Integer> values = Arrays.asList(12, 20, 35, 46, 55, 68, 75);
		
		int result=0;
		
		/*	we are summing up numbers that divisible by 5. 
		 *  first we only take the numbers divisible by 5, 
		 *  and then sum it up.
		 *  this type of coding is called imperative coding where 
		 *  we have to focus on both things; how and what to do */
		
		for(int i : values){
			if(i%5==0){
				result+=i;
			}
		}
		System.out.println("using enhanced loop: "+result);
		
		/*	we are using stream to achieve the same thing
		 * 	1. convert the values to stream,
		 * 	2. use the filter method to remove numbers that is not divisible by 5
		 * 	3. filter uses true/false value.
		 * 	4. i->i%5==0 means for every element, 
		 *  remove the elements that is not divisible by 5	
		 *  then, the remaining elements, sum it up using reduce()	 */
		
		System.out.println(values.stream().filter(i->i%5==0).reduce(0,(c,e)->c+e));
	}
}
