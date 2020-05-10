package StreamApi;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;

/*
 * advantage of streams?
 * 
 * 1. Streams have a strong affinity with functions. 
 * Java 8 introduces lambdas and functional interfaces, 
 * which opens a whole toybox of powerful techniques. 
 * Streams provide the most convenient and natural way 
 * to apply functions to sequences of objects.
 * 
 * 2. Streams encourage less mutability. 
 * This is sort of related to the functional programming aspect
 *  -- the kind of programs you write using streams tend to 
 *  be the kind of programs where you don't modify objects.
 *  
 *  3. Streams encourage looser coupling. 
 *  Your stream-handling code doesn't need to know the source 
 *  of the stream, or its eventual terminating method.
 *  
 *  here we show some of methods streams api can do
 */
public class Overview {

	public static void main(String[] args) {

		/*	the value sample	*/
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> arrange = Arrays.asList(4,1,3,7,8,10,9,2,6,5); //not in order
		
		/* 1. ‘forEach’ method uses internal iteration of each element of the stream.  */
		list.forEach(i -> System.out.print(i+" "));
		System.out.println();
		
		
		
		
		/* 2. The ‘map’ method is used to map each element to its corresponding result. 
		 * The following code segment prints unique squares of numbers using map.
		 * and prints it. since the values after manipulated is a stream type,
		 * we will print using: 1. forEach and 2. to convert to array and use enhanced loop		 */
		
		list.stream().map(i -> i*i).forEach(i -> System.out.print(i+" ")); //method 1
		System.out.println("");
//		Object[] array = list.stream().map(i->i*i).toArray();
//		for(Object o:array) //method 2
//			System.out.println(o);
//		
		
		
		
		/* 3. The ‘filter’ method is used to eliminate elements based on a criteria. 
		 * The following code eliminate even numbers / odd segment prints a count of empty strings using filter.*/
		list.stream().filter(i -> i%2 !=0).forEach(i -> System.out.print(i+" ")); //remove even
		System.out.println();
		list.stream().filter(j -> j%2 ==0).forEach(j -> System.out.print(j+" ")); //remove odd
		System.out.println();
		
		
		
		
		/*	4. The ‘sorted’ method is used to sort the stream. 
		 *  The following code segment shows how to print 10 numbers in a sorted order.	*/
		System.out.print("before sorted: "+arrange+ "\nafter sorted: ");
		arrange.stream().sorted().forEach(i->System.out.print(i));
		
		
		
		/*	5. statistics collectors are introduced to calculate all statistics when stream processing is being done.	*/
		IntSummaryStatistics stats = list.stream().mapToInt(i -> i).summaryStatistics();
		System.out.println("\n\nmax val: "+stats.getMax());
		System.out.println("min val: "+stats.getMin());
		System.out.println("sum val: "+stats.getSum());
		System.out.println("avg val: "+stats.getAverage());
	}
}