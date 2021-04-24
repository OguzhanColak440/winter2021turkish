package day24_Array;

import java.util.Arrays;

public class Arrays05 {

	public static void main(String[] args) {
		// karısık sıralı verilen bir array i sıralı olarak yazdırınız
		
		
		int arr[]= {25,17,6,78,45,69,1};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		// aynı array i büyükten kücüge dogru nasıl yazdırabiliriz
		
		for (int i = arr.length-1; i >=0; i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		System.out.println(Arrays.toString(arr));
		
		
		// Aynı array i büyükten kucuge dogru nasıl sıralayabiliriz
		
		int arrTers[]=new int[arr.length]; // ilk array ın uzunluguna esit yeni bir aray olusturudm
		
		for (int i = 0; i < arrTers.length; i++) {
			arrTers[i]=arr [arr.length-1-i];
		}
		
		System.out.println(Arrays.toString(arrTers));
		

	}

}
