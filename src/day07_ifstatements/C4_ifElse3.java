package day07_ifstatements;

import java.util.Scanner;

public class C4_ifElse3 {

	public static void main(String[] args) {

		//
		Scanner scan = new Scanner(System.in);

		System.out.println("L�tfen yas�n�z� giriniz");

		int yas = scan.nextInt();

		if (yas >= 65) {

			System.out.println("Emekli olabilirsiniz");

		} else {
			System.out.println("emekli olamazs�n�z");
		}
		scan.close();
	}

}
