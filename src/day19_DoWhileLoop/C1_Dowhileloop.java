package day19_DoWhileLoop;

import java.util.Scanner;

public class C1_Dowhileloop {

	public static void main(String[] args) {
		
	       // Kullanicidan bir cumle ve bir harf isteyin
        // while loop kullanarak cumlede istenen harf kac kez kullanilmis bulunuz
        // program Case Sensitive olsun
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle= scan.nextLine();
        System.out.println("Lutfen saymak istediginiz harfi giriniz");
        String harf= scan.next().substring(0, 1); // String olarak ilk harfi alir
        
       int index=0;
       int count=0;
       
       while(index<cumle.length()) {
    	   if (cumle.substring(index, index+1).equals(harf)) {
    		   count++;
    		  
			 
    		   
		}
    	   index++;
       }
      
 	   System.out.println(harf+"  harfi c�mlede " + count +" : defa kullan�ld�");
}
}	

	    
	    
	

	


