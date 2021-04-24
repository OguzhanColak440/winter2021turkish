package day25_arrays;

import java.util.Arrays;

public class MultiDimensionalArrays01 {

	public static void main(String[] args) {
		
		
		int arr[][]= {{1,3,5},{3,5},{5,9,11,3}}; //2 katlý bir array
		
		//11i index ile ifade etmek istersek arr[2][2];
		
		// eðer array ý uzunlukla declare etmek istersek inner array uzunluklarý eþit olmaý
		
		int arr2 [][]= new int [3][2];
		// [3]ilkyazýlan sayý outer array in icinde kac tane inner array oldugunu belirtir
		// [2] her bir inner array in uzunlugunu 
				
			System.out.println(Arrays.toString(arr2));
			
			//Multidimensional arraylari yazdýrmak icin toString methodu kullanýlamaz
			// Cünki toString methodu outer array i Stringe cevirir
			//Outer array in icinde inner Arraylar oldugundan toString methodunda inner array'lerin referans
			//deðerleri yazdýrýlýr
			System.out.println(Arrays.deepToString(arr2)); 
			
			
			
		

	}

}
