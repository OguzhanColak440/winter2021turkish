package day06_ifstatements;

import java.util.Scanner;

public class C3_IfStatement3 {

	public static void main(String[] args) {
		
		// Kullanýcýdan gün isminin ilk harfini isteyin
		// ve harfe uygun olan gün isimlerini yazdýrýn
		// c --> Cuma,Cumartesi
		// s --> Sali
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lütfen girmek istediðiniz günün ilk harfini giriniz");
		
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
	
		System.out.println("lütfen gecerli bir harf yazýnýz");
	
	{
		scan.close();
	}

	}

}
