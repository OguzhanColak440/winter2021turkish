package day10_switchCase;

import java.util.Scanner;

public class C5_SwitchCase3 {

	public static void main(String[] args) {
		// kullanýcýdan hangi günde oldugumuzu isteyin
		//yazýyla
		// girilen gün hafta ici veya hafta sonu oldugunu yazdýrýn
		
		Scanner scan=new Scanner (System.in);
		System.out.println("lütfen gün ismini yazýnýz");
		String gun=scan.next().toLowerCase();
		
		switch (gun) {
		
		case "pazartesi" :
		case"salý" :
		case"carsamba" :
		case"persembe":
		case"cuma" :
			System.out.println("haftaici");
			break ;
		case"cumartesi" :
		case"pazar" :
			System.out.println("haftasonu");
			break;
			
			default :
			System.out.println("lütfen gecerli gün giriniz");
			
			
		}
		
	    scan.close();

	   
}
}