package day19_DoWhileLoop;

import java.util.Scanner;

public class C4_DoWhileLoop2 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan toplamak uzere pozitif sayilar isteyin,
		 *  islemi bitirmek icin 0�a basmasini soyleyin.
          Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin
           ve
          �Negatif sayi giremezsiniz� yazdirip basa donun
        Kullanici 0�a bastiginda toplam kac pozitif sayi girdigini,
        yanlislikla kac negative sayi girdigini ve girdigi pozitif sayilarin
           toplaminin kac oldugunu yazdirin.
		 */
        Scanner scan=new Scanner (System.in);
	int countpoz=0;
	int countneg=0;
	int toplampoz=0;
	int say�=1;
	
	  System.out.println("oyuna hg bitirmek istediginizde 0 a bas�n�z");
   do {
	 
	   System.out.println("l�tfen pozitif bir say� giriniz");
	   say�=scan.nextInt();
	  
	   if (say�>0)	   {
		countpoz++;
		toplampoz+=say�;
		   
	}  if(say�<0){
		    countneg++;
		    System.out.println("negatifbir say� giremezsiniz");
	}
	   
	   
   }while(say� !=0);
   
   System.out.println("toplam  " + countpoz + " pozitif say� girdiniz");
   System.out.println("toplam" + countneg + "negatif say� girdiniz"); 	
   System.out.println("Giridiginz pozitif say�lar�n toplam� : " +toplampoz);
		
		
	}

}
