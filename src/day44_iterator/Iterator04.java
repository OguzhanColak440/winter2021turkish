package day44_iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator04 {

	public static void main(String[] args) {

		List<Integer> lisy = new ArrayList<>();

		lisy.add(2);
		lisy.add(13);
		lisy.add(56);
		lisy.add(23);
		lisy.add(45);
		lisy.add(14);
		lisy.add(40);
		
		System.out.println(lisy);
		
		ListIterator li1=lisy.listIterator();
	    
		while(li1.hasNext()) {
			li1.next();
		}
		
		while(li1.hasPrevious()) {
			System.out.print(li1.previous()+" ");
		
		}

		System.out.println("");
		System.out.println(lisy);
	}

}
