package day17_forLoop;

import java.util.Iterator;
import java.util.Scanner;

public class C3_ForLoop3 {

	public static void main(String[] args) {
		
		// Kullanýcýdan 35 dan kucuk pozitif bir sayý alýn
		// girilen sayýnýn factoryelini hedaplayýp yazdýran bir method olusturun
         
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("lütfen faktoryelini hesaplamak icin bir sayý giriniz");
		
		int sayý=scan.nextInt();
	
		if (sayý<0 || sayý>42) {
			  
			System.out.println("gecerli sayý giriniz");
			
		} else {
			faktoryelBul(sayý);

		}
				
		
	}

	public static void faktoryelBul(int sayý) {
		long faktoryel=1;
		for (int i = 1; i <=sayý ; i++) {
			faktoryel*=i;
			System.out.println(faktoryel);
		}
		
		
	}

}
