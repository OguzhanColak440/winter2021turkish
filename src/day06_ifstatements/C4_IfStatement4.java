package day06_ifstatements;

import java.util.Scanner;

public class C4_IfStatement4 {

	public static void main(String[] args) {
		// kullanýcýdan gün ismini isteyin
		// girilen gün hafta ici veya haftasonu oldugunu yazdýrýn
		
		// pazar --> haftasonu; sali hafta ici
		
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Lütfen bir gün adýný giriniz");
	
	String günAdý = scan.next().toLowerCase();
	
	
	// eger Stringlerde esitlik sorguluyorsak == kullanmamalýyýz
	// Stringlerde esit olma durumunu sorgulamak icin equal ()
	
	
	if(günAdý.equals("cumartesi") || günAdý.equals("pazar"));
		
		System.out.println("haftasonu");
		
		
scan.close();

		
	

	}

}
