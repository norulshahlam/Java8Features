/*
iterators are used in Collection framework in Java to retrieve elements one by one. There are three iterators.
1. enumeration
2. iterator. It is a universal iterator as we can apply it to any Collection object. 
By using Iterator, we can perform both read and remove operations. 
It is improved version of Enumeration with additional functionality of remove-ability of a element.
Iterator must be used whenever we want to enumerate elements in all Collection 
framework implemented interfaces like Set, List, Queue, Deque and also in all implemented classes of Map interface. 
Iterator is the only cursor available for entire collection framework.
3. ListIterator. It is only applicable for List collection implemented classes like arraylist, linkedlist etc. 
It provides bi-directional iteration. ListIterator must be used when we want to enumerate elements of List. 
This cursor has more functionality(methods) than iterator. 
 */

package Iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Demo {

	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		Iterator<Integer> i = l.iterator();
		
		while(i.hasNext())
			System.out.println(i.next());
		
		/* E next();
		 * Removes from the underlying collection the last element returned
		 * by this iterator (optional operation).  This method can be called
		 * only once per call to {@link #next}.x`x`
		 */
		
		while(i.hasNext())
			System.out.println(i.next());
		
		
	}

}
