package Collections;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueExample {
	
  /* *
	 * The peek() method : retrieves the value of the first element of the queue without removing it from the queue. 
	 * For each invocation of the method we always get the same value and its execution
	 * does not affect the size of the queue. If the queue is empty the peek() method returns null.
	 *  
	 * The element() method : behaves like peek(), so it again retrieves the value of the first element without removing it. 
	 * Unlike peek ), however, if the list is empty element() throws a NoSuchElementException
     *  
     * The poll() method : retrieves the value of the first element of the queue by removing it from the queue. . 
     * At each invocation it removes the first element of the list and if the list is already empty it returns null 
     * but does not throw any exception
     *      
	 * The remove() method : behaves as the poll() method, so it removes the first element of the list 
	 * and if the list is empty it throws a NoSuchElementException
	 * 
	 * */
	
	
	public static void main(String[] args) 
	{
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("hello1");
		queue.add("hello2");
		queue.add("hello4");
		queue.add("hello3");
		queue.add("hello5");
		queue.add("hello6");
		
		System.out.println("Actual queue Collection.");
		System.out.println(queue);
		System.out.println("after element():");
		queue.element();
		System.out.println(queue);
		
		System.out.println("after peek():");
		queue.peek();
		System.out.println(queue);
		
		System.out.println("after poll():");
		queue.poll();
		System.out.println(queue);
		
		System.out.println("after remove():");
		queue.remove();
		System.out.println(queue);	
		
		
		/* Converting PriorityQueue to normal arrays */
		System.out.println("converting to array");
		String[] arr = queue.toArray(new String[queue.size()]);
		for(int i=0;i<queue.size();i++)
		{		
			System.out.println(arr[i]);
		}
		
		
		/* Converting normal arrays to ListCollection */
		System.out.println("converting to list collections");
		List<String> col=Arrays.asList(arr);
		for(int i=0;i<col.size();i++)
		{
			System.out.println(col.get(i));
		}
		
		/* Converting ListCollection to PriorityQueue */
		System.out.println("Converting ListCollection to PriorityQueue");
		PriorityQueue<String> queue1 = new PriorityQueue<String>();
		queue1.addAll(col);
		System.out.println(queue1);
			
	}

}
