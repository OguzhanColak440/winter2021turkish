package day24_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays04 {

	public static void main(String[] args) {
		// Kullan�c�dan de�erler alarak int bir array olusturun
		// Once kullan�c�ndan girece�i say� adedini almam�z laz�mki arryi olusturalim
		
		Scanner scan=new Scanner (System.in);
		System.out.println("L�tfen kac say�dan olusan bir array istedi�inizi yaz�n�z");
		int uzunluk=scan.nextInt();
		
		int arr[]=new int [uzunluk];  // 5
		
		System.out.println("L�tfen say�lar� giriniz");
		for (int i = 0; i < arr.length; i++) {
			
			arr[i]=scan.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		

	}

}
