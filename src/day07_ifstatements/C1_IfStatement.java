package day07_ifstatements;

import java.util.Scanner;

public class C1_IfStatement {

	public static void main(String[] args) {
		//
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("L�tfen bir tam say� giriniz");
		
		int sayi=scan.nextInt();
		
		if (sayi>0) {
			System.out.println("say� pozitif");
		}

		if (sayi<100) {
			System.out.println("k�c�k say�");
			
		}
	
	if (sayi>1000) {
	System.out.println("b�y�k say�");
	}
	
scan.close();
}
}