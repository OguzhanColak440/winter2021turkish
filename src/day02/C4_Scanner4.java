package day02;

import java.util.Scanner;

public class C4_Scanner4 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Lütfen parolanýzý giriniz");
		int parola=scan.nextInt();
		
		System.out.println("Lütfen ikinci parolanýzý giriniz");
		int parola1=scan.nextInt();
		System.out.println(parola+" "+parola1);
		
		scan.close();
	
	}

}
