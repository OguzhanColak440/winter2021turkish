package day25_arrays;

import java.util.Arrays;

public class Arrays04 {

	public static void main(String[] args) {
		
		//iki array in eþit oldugunu konrtol etme
		
		int arr1[]= {10,25,5,20};
		int arr2[]= {25,10,20,5};
		
		System.out.println(Arrays.equals(arr1, arr2));
		
		Arrays.sort(arr1); //[5, 10, 20, 25]
		Arrays.sort(arr2); //[5, 10, 20, 25]
		
		System.out.println(Arrays.equals(arr1, arr2));
		
		// iki array in birbirine eþit olmasý icin hem uzunluklarý
		// icindeki tüm elemanlar ve esit elemanlarýn indexleri esit olmalýdýr
		
		
		

	}

}
