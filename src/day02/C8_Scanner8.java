package day02;

import java.util.Scanner;

public class C8_Scanner8 {
public static void main(String[] args) {
	
	
Scanner  scan = new Scanner (System.in);

System.out.println("Ýsminiz nedir");

String isminiz = scan.nextLine();

System.out.println("soyisminiz nedir");

String soyisim = scan.next();

System.out.println("isminiz ve soyisminiz " + isminiz + soyisim + 25);

scan.close();
	
			
}
}
