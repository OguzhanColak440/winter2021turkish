package day07_ifstatements;

import java.util.Scanner;

public class C5_ifElse4 {

	public static void main(String[] args) {
		// kullan�c�dan 3genin kenar uzunluklar�n� al�n
		// 3 kenar esit ise eskenar yazd�r�n
		// yoksa eskenar degil yazd�r�n
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("�cgenin kenar uzunluklar�n� giriniz");
		
		double kenar1=scan.nextDouble();
        double kenar2=scan.nextDouble();
        double kenar3=scan.nextDouble();
        
        if (kenar1==kenar2 && kenar2==kenar3) {
        	
        	System.out.println("eskenar");
			
		} else {
             System.out.println("eskenar degil");
		}
	scan.close();
	}

}
