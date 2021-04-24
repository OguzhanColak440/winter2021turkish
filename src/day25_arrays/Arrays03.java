package day25_arrays;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		
		// Verilen bir string i array e nasýl ceviriririz		
		// Verilen bir cümlede kac kelime oldugunu bulunuz		
		// Verilen cümlede her kelimenin ilk harfini büyük yapýnýz
		
		String str="Herkes Javayý tanýsa severdi";
		//Bu stringi kelimelere ayýralým
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
