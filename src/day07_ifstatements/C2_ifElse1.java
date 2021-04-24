package day07_ifstatements;

import java.util.Scanner;

public class C2_ifElse1 {

	public static void main(String[] args) {
		// kullanýcýdan dikdörtgennin kenar uzunluklarýmný alýn
		// uzunluklar esit ise kare degil ise kare deðil
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("dikdörtgenin kenar uzunluklarýný yazýnýz");
		
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
				
				if (kenar1==kenar2) {
			System.out.println("kare"); }
			
			else {  
				System.out.println("kare degil");
			}
				
				
				scan.close();
	}
			
				
	}

				
				
			
			
		
		


