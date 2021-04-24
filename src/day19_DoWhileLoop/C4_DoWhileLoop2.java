package day19_DoWhileLoop;

import java.util.Scanner;

public class C4_DoWhileLoop2 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan toplamak uzere pozitif sayilar isteyin,
		 *  islemi bitirmek icin 0’a basmasini soyleyin.
          Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin
           ve
          “Negatif sayi giremezsiniz” yazdirip basa donun
        Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
        yanlislikla kac negative sayi girdigini ve girdigi pozitif sayilarin
           toplaminin kac oldugunu yazdirin.
		 */
        Scanner scan=new Scanner (System.in);
	int countpoz=0;
	int countneg=0;
	int toplampoz=0;
	int sayý=1;
	
	  System.out.println("oyuna hg bitirmek istediginizde 0 a basýnýz");
   do {
	 
	   System.out.println("lütfen pozitif bir sayý giriniz");
	   sayý=scan.nextInt();
	  
	   if (sayý>0)	   {
		countpoz++;
		toplampoz+=sayý;
		   
	}  if(sayý<0){
		    countneg++;
		    System.out.println("negatifbir sayý giremezsiniz");
	}
	   
	   
   }while(sayý !=0);
   
   System.out.println("toplam  " + countpoz + " pozitif sayý girdiniz");
   System.out.println("toplam" + countneg + "negatif sayý girdiniz"); 	
   System.out.println("Giridiginz pozitif sayýlarýn toplamý : " +toplampoz);
		
		
	}

}
