package day26_arraylists;

import java.util.ArrayList;
import java.util.List;

public class C3_ArrayList02 {

	public static void main(String[] args) {
		// List in uzunlugu nasıl bulunur
		
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(15);
		list.add(8);
		list.add(12);
		list.add(20);
		
		System.out.println(list);
		
		System.out.println(list.size());
		
		// bir eleman nasıl silinir
		
	   list.remove(1);
	   System.out.println(list);
		
	  System.out.println( list.remove(2));
	  System.out.println(list);
	  
	  List<String> list2 = new ArrayList<>();
	  
	  list2.add("Ali");
	  
	  System.out.println(list2.remove("Hasan"));
	  System.out.println(list2);
	  
	  System.out.println(list2.remove("Ali"));
	  
	  System.out.println(list2);
	  
	  
	  
		

	}

}
