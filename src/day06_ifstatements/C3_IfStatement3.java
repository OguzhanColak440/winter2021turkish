package day06_ifstatements;

import java.util.Scanner;

public class C3_IfStatement3 {

	public static void main(String[] args) {
		
		// Kullan�c�dan g�n isminin ilk harfini isteyin
		// ve harfe uygun olan g�n isimlerini yazd�r�n
		// c --> Cuma,Cumartesi
		// s --> Sali
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("L�tfen girmek istedi�iniz g�n�n ilk harfini giriniz");
		
		char  ilkHarf=scan.next().charAt(0);
		
	
		
		
		if (ilkHarf=='p' || ilkHarf=='P') {
			
		System.out.println("pazar pazartesi veya persembe");
		
			
		}
		
		if (ilkHarf=='s' || ilkHarf=='S') {
			
			System.out.println("sali");
			
		}
		
		if(ilkHarf=='c' || ilkHarf=='C') {
			
			System.out.println("carsamba,cuma veya cumartesi");
			
			
		}
	
	if (ilkHarf!='p' && ilkHarf!='P'  && ilkHarf!='s'
		&&	ilkHarf!='S'  && ilkHarf!='C'  && ilkHarf!='M'  && ilkHarf!='c' ) 
	
		System.out.println("l�tfen gecerli bir harf yaz�n�z");
	
	{
		scan.close();
	}

	}

}
