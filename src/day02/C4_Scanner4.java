package day02;

import java.util.Scanner;

public class C4_Scanner4 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		System.out.println("L�tfen parolan�z� giriniz");
		int parola=scan.nextInt();
		
		System.out.println("L�tfen ikinci parolan�z� giriniz");
		int parola1=scan.nextInt();
		System.out.println(parola+" "+parola1);
		
		scan.close();
	
	}

}
