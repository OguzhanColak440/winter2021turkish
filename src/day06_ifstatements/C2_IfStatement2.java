package day06_ifstatements;

import java.util.Scanner;

public class C2_IfStatement2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("L�tfen bir tam say� giriniz");
		
		int sayi = scan.nextInt();
		
		if (sayi%2==0) {
			
			System.out.println("girdiginiz say� cift say�d�r");
		}
	
		if (sayi%2==1) {
		System.out.println("girdi�iniz say� tek say�");
		
		
		}
		
		System.out.println("katildi�iniz icin tsk");
		
		
		scan.close();
	}

	
}
