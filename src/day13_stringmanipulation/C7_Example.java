package day13_stringmanipulation;

import java.util.Scanner;

public class C7_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		
		System.out.println("dört harfli bi kelime giriniz");
		
		String str = scan.nextLine();
		
		if (str.length()!=4) {
			System.out.println("lütfen 4 karakterli bi harf girin");
		} else {
          System.out.print(str.substring(3));
          System.out.print(str.substring(2, 3));
          System.out.print(str.substring(1, 2));
          System.out.print(str.substring(0, 1));
		
		scan.close();
		}
	}

}
