package day10_switchCase;

import java.util.Scanner;

public class C6_SwitchCase4 {

	public static void main(String[] args) {
		
		// kullanýcýdan VIP kýsaltmasýnda hangi harfin anlamýný istedigini
		// soralým girilen harfin acýklamasýný yazdýralým
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("lütfen hangi harfin kýsaltmasýný istediginizi yazýnuz");
		
		char harf = scan.next().charAt(0);
		
		switch(harf) {
		
		case 'v' :
		case'V' :
			System.out.println("very");
		    break;
		case'ý' :
		case'I' :
			System.out.println("ýmportant");
			break;
		case 'p' :
		case'P' :
			System.out.println("person");
			break;
			default :
				System.out.println("gecersiz harf");
				
		
		scan.close();
		} 
		
		
		
		
      
		
		
	}

}
