package day25_arrays;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		
		// Verilen bir string i array e nas�l ceviriririz		
		// Verilen bir c�mlede kac kelime oldugunu bulunuz		
		// Verilen c�mlede her kelimenin ilk harfini b�y�k yap�n�z
		
		String str="Herkes Javay� tan�sa severdi";
		//Bu stringi kelimelere ay�ral�m
		// Split metodu
		
		String arr[]=str.split(" ");
		System.out.println(Arrays.toString(arr));
		
		
		String arr2[]=str.split("Java");
		System.out.println(Arrays.toString(arr2));
		
		String arr3[]=str.split("a");
		System.out.println(Arrays.toString(arr3));
		
		String arr4[]=str.split("");
		System.out.println(Arrays.toString(arr4));
	}

}
