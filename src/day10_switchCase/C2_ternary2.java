package day10_switchCase;

import java.util.Scanner;

public class C2_ternary2 {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("l�tfen bir tam say� giriniz");
		int rakam=scan.nextInt();
		
	String sonuc= rakam%2==0 ? "cift" : rakam*rakam+" ";
	System.out.println(sonuc);
		
		
scan.close();
	}

}
