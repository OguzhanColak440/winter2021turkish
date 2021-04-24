package day02;

import java.util.Scanner;

public class C7_Scanner7 {
public static void main(String[] args) {
	Scanner scan= new Scanner (System.in);
	System.out.println("dairenin kenar uzunlugunu giriniz");
	double kenar=scan.nextDouble();
	System.out.println("girdiginiz kenar uzunlugu  " + kenar*kenar);
	
	
	scan.close();

	
	
}
}
