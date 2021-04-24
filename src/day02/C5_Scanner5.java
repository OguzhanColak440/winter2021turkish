package day02;

import java.util.Scanner;

public class C5_Scanner5 {
public static void main(String[] args) {
	Scanner scan=new Scanner (System.in);
	System.out.println("lütfen isminizi giriniz");
	String name = scan.nextLine();
	System.out.println("Lütfen soy isim giriniz");
	String soyname=scan.nextLine();
	
	System.out.println(name+soyname);
	
	scan.close();
}
}
