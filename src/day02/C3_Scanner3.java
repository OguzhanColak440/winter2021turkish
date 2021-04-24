package day02;


import java.util.Scanner;

public class C3_Scanner3 {
	public static void main(String[] args) {
	Scanner scan=new Scanner (System.in);	
	System.out.println("lütfen isminizi giriniz");
	String name=scan.nextLine();
	System.out.println("lutfen soyisminizi giriniz");
	String surname=scan.next();
	System.out.println("isim ve soy isminiz = " +name+" "+surname);
	
	scan.close();
	
	}

}
