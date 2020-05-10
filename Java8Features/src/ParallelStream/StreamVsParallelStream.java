package ParallelStream;

import java.util.ArrayList;
import java.util.Random;

/*	we show how fast is parallel stream vs stream
 * we will use both methods and time them and show the results	*/
public class StreamVsParallelStream {

	public static void main(String[] args) {

		Random r = new Random();
		ArrayList<Integer> data = new ArrayList<>();
		
		//generate 10,000,000 random numbers
		for(int i=0; i<10000000; i++)
			data.add(r.nextInt());
		
		//aggregate all elements of random data and time them
		//normal stream
		long start1 = System.currentTimeMillis(); 
		data.stream().reduce(0,(c,e) -> c+e);
		long end1 = System.currentTimeMillis()-start1;
		
		
		//aggregate all elements of random data and time them
		//parallel stream
		long start2 = System.currentTimeMillis(); 
		data.parallelStream().reduce(0,(c,e) -> c+e);
		long end2 = System.currentTimeMillis()-start2;
		
		System.out.println("normal stream: "+end1+" secs");
		System.out.println("parallel stream: "+end2+" secs");
		System.out.println("ratio of normal to parallel: "+(end1/end2));
	}
/*	it is noted that when data is around 10M, the parallel stream gives
 *  significant results. anything lower or higher than that, parallel
 *  still is faster, only that not significant enough	*/
}
