package day47_queue_maps;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C1_Queue01 {

	public static void main(String[] args) {
		
		Queue<String> k1 = new PriorityQueue<>();
		k1.add("D");
		k1.add("C");
		k1.add("M");
		k1.add("A");
		
		System.out.println(k1);
		
		
		
	Queue<String> k2 = new LinkedList<>();
     	k2.add("D");
		k2.add("C");
		k2.add("M");
		k2.add("A");
		
		System.out.println(k2);
		
		k2.offer("Z");
		
		System.out.println(k2);
	   
		System.out.println( k2.peek());

		System.out.println(k2);
		
	   System.out.println(	k2.poll());
	   
	   k2.remove();
	   k2.remove();
	   System.out.println(k2);
	   k2.remove();
	   k2.remove();
	   System.out.println(k2);
	   k2.remove();
	   System.out.println(k2);
	   k2.poll();
	   System.out.println(k2);
	   
		
	
		
		

	}

}
