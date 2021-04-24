package day25_arrays;

import java.util.Arrays;

public class MultiDimensionalArrays01 {

	public static void main(String[] args) {
		
		
		int arr[][]= {{1,3,5},{3,5},{5,9,11,3}}; //2 katl� bir array
		
		//11i index ile ifade etmek istersek arr[2][2];
		
		// e�er array � uzunlukla declare etmek istersek inner array uzunluklar� e�it olma�
		
		int arr2 [][]= new int [3][2];
		// [3]ilkyaz�lan say� outer array in icinde kac tane inner array oldugunu belirtir
		// [2] her bir inner array in uzunlugunu 
				
			System.out.println(Arrays.toString(arr2));
			
			//Multidimensional arraylari yazd�rmak icin toString methodu kullan�lamaz
			// C�nki toString methodu outer array i Stringe cevirir
			//Outer array in icinde inner Arraylar oldugundan toString methodunda inner array'lerin referans
			//de�erleri yazd�r�l�r
			System.out.println(Arrays.deepToString(arr2)); 
			
			
			
		

	}

}
