package day07_ifstatements;

import java.util.Scanner;

public class C2_ifElse1 {

	public static void main(String[] args) {
		// kullan�c�dan dikd�rtgennin kenar uzunluklar�mn� al�n
		// uzunluklar esit ise kare degil ise kare de�il
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("dikd�rtgenin kenar uzunluklar�n� yaz�n�z");
		
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

				
				
			
			
		
		


