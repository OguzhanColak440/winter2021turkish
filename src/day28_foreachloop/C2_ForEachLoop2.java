package day28_foreachloop;

import java.util.Iterator;

public class C2_ForEachLoop2 {

	public static void main(String[] args) {
		/*
		 * Bir integer array olusturunuz ve bu array�deki
		 *  tum sayilarin carpimini
		 *  For-each loop kullanarak bulunuz. 
		 * Sonucu ekrana yazdiriniz.
		 */
		
		
		int arr[]= {1,2,1,2,4,3,1,2};
		
		int carp�m=1;
		for (int each : arr) {
			
		carp�m=carp�m*each;
		
			
		}
		
		System.out.println(carp�m);

	}

}
