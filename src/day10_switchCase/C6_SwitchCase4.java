package day10_switchCase;

import java.util.Scanner;

public class C6_SwitchCase4 {

	public static void main(String[] args) {
		
		// kullan�c�dan VIP k�saltmas�nda hangi harfin anlam�n� istedigini
		// soral�m girilen harfin ac�klamas�n� yazd�ral�m
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("l�tfen hangi harfin k�saltmas�n� istediginizi yaz�nuz");
		
		char harf = scan.next().charAt(0);
		
		switch(harf) {
		
		case 'v' :
		case'V' :
			System.out.println("very");
		    break;
		case'�' :
		case'I' :
			System.out.println("�mportant");
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
