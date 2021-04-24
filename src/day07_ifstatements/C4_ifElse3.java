package day07_ifstatements;

import java.util.Scanner;

public class C4_ifElse3 {

	public static void main(String[] args) {

		//
		Scanner scan = new Scanner(System.in);

		System.out.println("Lütfen yasýnýzý giriniz");

		int yas = scan.nextInt();

		if (yas >= 65) {

			System.out.println("Emekli olabilirsiniz");

		} else {
			System.out.println("emekli olamazsýnýz");
		}
		scan.close();
	}

}
