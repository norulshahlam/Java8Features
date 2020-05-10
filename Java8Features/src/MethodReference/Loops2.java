package MethodReference;
/*
we demo how to use forEach while doing some simple manipulation eg double all numbers before printing it
 */
import java.util.Arrays;
import java.util.List;

public class Loops2 {

	public static void main(String[] args) {

		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5);

		//we are asking compiler to use print statement as reference for forEach to run on
		values.forEach(System.out::println); //this is method ref using the build-in method
		
		//we are asking compiler to use method DoubleIt as reference for forEach to run on. make sure method is static
		values.forEach(Loops2:: DoubleIt); 
	}
	public static void DoubleIt(int i){
		System.out.println("double it: "+i*2);
	}
}
