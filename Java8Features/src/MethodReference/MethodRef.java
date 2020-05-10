/*
this show what is method reference and what does it do
usually we call by value eg print(variables) but here we can use a method as input for another method (call by method) 	
how u can use the current method as well as your own custom method (another class)
 */

package MethodReference;

import java.util.Arrays;
import java.util.List;

public class MethodRef {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("apple","banana","carrot","date","elephant");
		
		names.forEach(System.out::println); //this is method ref using the build-in method

	}

}
