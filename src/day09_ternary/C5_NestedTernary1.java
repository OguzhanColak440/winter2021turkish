package day09_ternary;

import java.util.Scanner;

public class C5_NestedTernary1 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		System.out.println("lütfen kenarlarýný ölcmek icin 2 uzunluk veriniz");
		double kenar1 = scan.nextDouble();
		double kenar2 = scan.nextDouble();
		String sonuc= kenar1==kenar2 ? "kare" : "kare degil";
	System.out.println(sonuc);
		
		
		scan.close();
		
 
	}

}
