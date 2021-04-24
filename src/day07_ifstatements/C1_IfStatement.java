package day07_ifstatements;

import java.util.Scanner;

public class C1_IfStatement {

	public static void main(String[] args) {
		//
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Lütfen bir tam sayý giriniz");
		
		int sayi=scan.nextInt();
		
		if (sayi>0) {
			System.out.println("sayý pozitif");
		}

		if (sayi<100) {
			System.out.println("kücük sayý");
			
		}
	
	if (sayi>1000) {
	System.out.println("büyük sayý");
	}
	
scan.close();
}
}