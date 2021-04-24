package day24_Array;

import java.util.Arrays;

public class Arrays05 {

	public static void main(String[] args) {
		// kar�s�k s�ral� verilen bir array i s�ral� olarak yazd�r�n�z
		
		
		int arr[]= {25,17,6,78,45,69,1};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		// ayn� array i b�y�kten k�c�ge dogru nas�l yazd�rabiliriz
		
		for (int i = arr.length-1; i >=0; i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		System.out.println(Arrays.toString(arr));
		
		
		// Ayn� array i b�y�kten kucuge dogru nas�l s�ralayabiliriz
		
		int arrTers[]=new int[arr.length]; // ilk array �n uzunluguna esit yeni bir aray olusturudm
		
		for (int i = 0; i < arrTers.length; i++) {
			arrTers[i]=arr [arr.length-1-i];
		}
		
		System.out.println(Arrays.toString(arrTers));
		

	}

}
