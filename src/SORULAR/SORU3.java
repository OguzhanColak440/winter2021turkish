package SORULAR;

import java.util.Scanner;

public class SORU3 {

	public static void main(String[] args) {
		
		/*
        Kullanýcýdan bir isim ve karakter girmesini isteyin, sonra karakterin 
        kaç kez tekrarlandýðýný kontrol edin.
        e.g:
        char ch1= 'a' ;
        String name ="John came late" 
        => Tekrar Sayisi = 2
        */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lütfen bir isim giriniz");
		String isim=scan.next();
		System.out.println("Lütfen aramamý istediðiniz harfi giriniz");
		char aranan = scan.next().charAt(0);

		//ccabcabc
		int count = 0;
		for (int i = 0; i < isim.length(); i++) {
			if (isim.charAt(i) == aranan) {
				count++;
				scan.close();
			}
			
			
		}
		System.out.println("Cümlede aranan kelime : " + count + "defa kullanýlmýstýr");
		
		}
}
	
       
       
	
	


