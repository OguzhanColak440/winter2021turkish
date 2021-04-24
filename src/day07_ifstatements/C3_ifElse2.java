package day07_ifstatements;

import java.util.Scanner;

public class C3_ifElse2 {

	public static void main(String[] args) {
		
		//kullanıcıdan bir karakter girmesini isteyin
		// harf olup olmadını yazdırın
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lütfen bir karakter giriniz");
		
		char karakter = scan.next().charAt(0);
		
	if (karakter >='a' && karakter <='z' ||(karakter >='A' && karakter <='Z') ) {
		
		
		System.out.println("girdiginiz karakter harf");
	} else {
        
		
		System.out.println("girdiginiz karakter harf degil");
	}

	scan.close();
	}

}
