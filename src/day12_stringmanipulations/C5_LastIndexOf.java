package day12_stringmanipulations;

import java.util.Scanner;

public class C5_LastIndexOf {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("lütfen bir cumle giriniz");
		
		String cumle = scan.nextLine().toLowerCase();
		
		int sonuc = cumle.indexOf("java");
		int sonuc1=cumle.lastIndexOf("java");
		if (sonuc==-1) {
			System.out.println("cumle java icermiyor");
		} else if (sonuc==sonuc1){
			
			System.out.println("cumle 1 java kelimesi iceriyor");

		}else 
		
			System.out.println("cumle birden fazla java iceriyor");
		
		
		scan.close();

	}

}
