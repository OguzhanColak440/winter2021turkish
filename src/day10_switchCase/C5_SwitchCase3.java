package day10_switchCase;

import java.util.Scanner;

public class C5_SwitchCase3 {

	public static void main(String[] args) {
		// kullan�c�dan hangi g�nde oldugumuzu isteyin
		//yaz�yla
		// girilen g�n hafta ici veya hafta sonu oldugunu yazd�r�n
		
		Scanner scan=new Scanner (System.in);
		System.out.println("l�tfen g�n ismini yaz�n�z");
		String gun=scan.next().toLowerCase();
		
		switch (gun) {
		
		case "pazartesi" :
		case"sal�" :
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
			System.out.println("l�tfen gecerli g�n giriniz");
			
			
		}
		
	    scan.close();

	   
}
}