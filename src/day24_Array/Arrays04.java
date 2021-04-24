package day24_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays04 {

	public static void main(String[] args) {
		// Kullanýcýdan deðerler alarak int bir array olusturun
		// Once kullanýcýndan gireceði sayý adedini almamýz lazýmki arryi olusturalim
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Lütfen kac sayýdan olusan bir array istediðinizi yazýnýz");
		int uzunluk=scan.nextInt();
		
		int arr[]=new int [uzunluk];  // 5
		
		System.out.println("Lütfen sayýlarý giriniz");
		for (int i = 0; i < arr.length; i++) {
			
			arr[i]=scan.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		

	}

}
