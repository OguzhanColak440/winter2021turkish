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
		    
		        
		        System.out.println("Lütfen sayýlar giriniz");
		        
		        do {
		        	count++;
		        	sayi=scan.nextInt();		        	  
		        	toplam+=sayi;
				      
		        	
		        	if (toplam>100) {
						System.out.println("Girdiðiniz sayýlarýn toplamý 100 ü geçti bu kadar yeterli.");
						break;
					} else if (toplam<=100){
                     System.out.println("Lütfen biraz daha sayý giriniz");
											
					}
		        
		        	
					
				} while (sayi!=0);
		       System.out.println(count + " : defa sayý girdiniz ve sayýlarýn toplamý : " + toplam);
	}

}
		  
	
