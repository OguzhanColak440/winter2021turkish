package day06_ifstatements;

import java.util.Scanner;

public class C4_IfStatement4 {

	public static void main(String[] args) {
		// kullan�c�dan g�n ismini isteyin
		// girilen g�n hafta ici veya haftasonu oldugunu yazd�r�n
		
		// pazar --> haftasonu; sali hafta ici
		
	Scanner scan = new Scanner (System.in);
	
	System.out.println("L�tfen bir g�n ad�n� giriniz");
	
	String g�nAd� = scan.next().toLowerCase();
	
	
	// eger Stringlerde esitlik sorguluyorsak == kullanmamal�y�z
	// Stringlerde esit olma durumunu sorgulamak icin equal ()
	
	
	if(g�nAd�.equals("cumartesi") || g�nAd�.equals("pazar"));
		
		System.out.println("haftasonu");
		
		
scan.close();

		
	

	}

}
