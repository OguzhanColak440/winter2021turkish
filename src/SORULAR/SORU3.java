package SORULAR;

import java.util.Scanner;

public class SORU3 {

	public static void main(String[] args) {
		
		/*
        Kullan�c�dan bir isim ve karakter girmesini isteyin, sonra karakterin 
        ka� kez tekrarland���n� kontrol edin.
        e.g:
        char ch1= 'a' ;
        String name ="John came late" 
        => Tekrar Sayisi = 2
        */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("L�tfen bir isim giriniz");
		String isim=scan.next();
		System.out.println("L�tfen aramam� istedi�iniz harfi giriniz");
		char aranan = scan.next().charAt(0);

		//ccabcabc
		int count = 0;
		for (int i = 0; i < isim.length(); i++) {
			if (isim.charAt(i) == aranan) {
				count++;
				scan.close();
			}
			
			
		}
		System.out.println("C�mlede aranan kelime : " + count + "defa kullan�lm�st�r");
		
		}
}
	
       
       
	
	


