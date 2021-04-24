package day06_ifstatements;

import java.util.Scanner;

public class C2_IfStatement2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lütfen bir tam sayý giriniz");
		
		int sayi = scan.nextInt();
		
		if (sayi%2==0) {
			
			System.out.println("girdiginiz sayý cift sayýdýr");
		}
	
		if (sayi%2==1) {
		System.out.println("girdiðiniz sayý tek sayý");
		
		
		}
		
		System.out.println("katildiðiniz icin tsk");
		
		
		scan.close();
	}

	
}
