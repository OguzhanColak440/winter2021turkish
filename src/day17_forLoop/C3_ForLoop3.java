package day17_forLoop;

import java.util.Iterator;
import java.util.Scanner;

public class C3_ForLoop3 {

	public static void main(String[] args) {
		
		// Kullan�c�dan 35 dan kucuk pozitif bir say� al�n
		// girilen say�n�n factoryelini hedaplay�p yazd�ran bir method olusturun
         
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("l�tfen faktoryelini hesaplamak icin bir say� giriniz");
		
		int say�=scan.nextInt();
	
		if (say�<0 || say�>42) {
			  
			System.out.println("gecerli say� giriniz");
			
		} else {
			faktoryelBul(say�);

		}
				
		
	}

	public static void faktoryelBul(int say�) {
		long faktoryel=1;
		for (int i = 1; i <=say� ; i++) {
			faktoryel*=i;
			System.out.println(faktoryel);
		}
		
		
	}

}
