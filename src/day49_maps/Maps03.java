package day49_maps;

import java.util.HashMap;
import java.util.Map;

public class Maps03 {

	public static void main(String[] args) {
	
      Map<Integer,String>map1=new HashMap<>();
		
		map1.put(101, "Ali, Can, Java");
		map1.putIfAbsent(102, "Veli, Yan, Java");
		map1.put(103, "Ali, Yan, Java");	

		System.out.println(map1.get(101));
		System.out.println(map1.get(105));
		
		System.out.println(map1.getOrDefault(105, "Arad?g?n?z key mapte yok"));
	    System.out.println(map1.keySet()); 
	   
	    map1.replace(103, "Mesut, Aksu, Java");
	    System.out.println(map1);
	    
	    
	    Map<String,Integer> map2 = new HashMap<>();
	    map2.put("H", 1);
	    map2.put("e", 1);
	    map2.put("l", 2);
	    map2.put("o", 3);
	    
	    System.out.println(map2);
	    
	    map2.compute("H", (key,value)-> 10);
	    System.out.println(map2);
	    
	    map2.computeIfAbsent("A", v -> 15);
	    
	    System.out.println(map2);
	    
	    map2.computeIfAbsent("H", v-> 5);
	    System.out.println(map2);
	    
	    map2.computeIfPresent("H", (key,value)-> 20);
	    map2.computeIfPresent("M", (key,value)-> 20);
	    System.out.println(map2);
	    
	}

}
