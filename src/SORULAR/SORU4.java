package SORULAR;

import java.util.Scanner;

public class SORU4 {
	
	public static void main(String[] args) {
		
		
		        
		        /* Kullanicidan sayilar girmesini isteyin
		         * ve girdigi sayilari toplayip yazdirin.
		         * yeni sayi isteyin
		         * girilen sayilarin toplami 100 'u gecerse
		         * "... kere sayi girdin. Bu kadar sayi yeter" yazdirin ve oyunu bitirin
		         *
		         */
		        
		        Scanner scan = new Scanner(System.in);
		        int toplam = 0;
		        int count = 0;
		        int sayi = 0;
		    
		        
		        System.out.println("L�tfen say�lar giriniz");
		        
		        do {
		        	count++;
		        	sayi=scan.nextInt();		        	  
		        	toplam+=sayi;
				      
		        	
		        	if (toplam>100) {
						System.out.println("Girdi�iniz say�lar�n toplam� 100 � ge�ti bu kadar yeterli.");
						break;
					} else if (toplam<=100){
                     System.out.println("L�tfen biraz daha say� giriniz");
											
					}
		        
		        	
					
				} while (sayi!=0);
		       System.out.println(count + " : defa say� girdiniz ve say�lar�n toplam� : " + toplam);
	}

}
		  
	
