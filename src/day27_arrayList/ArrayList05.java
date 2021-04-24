package day27_arrayList;

import java.util.Arrays;
import java.util.List;

public class ArrayList05 {

	public static void main(String[] args) {
		//Verilen bir array i liste nasıl cevirebiliriz
         
		
	   String arr[]= {"Ali , Veli"};
		
	    List<String> listArr= Arrays.asList(arr);
	    
	    System.out.println(listArr);
	    
	    
	    Integer arr1[]= {1,2,3};
	    
	    List<Integer> list2 = Arrays.asList(arr1);
	    
	    System.out.println(list2);
	    
	    
	    arr1[1]=5;
	    
	    System.out.println(Arrays.toString(arr1));
	    
	    System.out.println("list2 " + list2);
	    
	    list2.set(2, 13);
	    
	    System.out.println("list2 " + list2);
	    System.out.println("array " + Arrays.toString(arr1));
	    
	  
	    
	    
	    
	}

}
