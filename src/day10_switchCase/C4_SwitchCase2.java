package day10_switchCase;

import java.util.Scanner;

public class C4_SwitchCase2 {

	public static void main(String[] args) {

		// kullan�c�dan kacinci ayda oldugunu al�n
		// ve ay ismini yazd�r�n

		Scanner scan = new Scanner(System.in);

		System.out.println("l�tfen kac�nc� ayda oldugumuzu yaz�n�z");

		int ay = scan.nextInt();

		switch (ay) {
		case 1:
			System.out.println("Ocak");
			break;
		case 2:
			System.out.println("Subat");
			break;
		case 3:
			System.out.println("Mart");
			break;
		case 4:
			System.out.println("Nisan");
			break;
		case 5:
			System.out.println("Mayis");
			break;
		case 6:
			System.out.println("Haziran");
			break;
		case 7:
			System.out.println("Temmuz");
			break;
		case 8:
			System.out.println("Agustos");
			break;
		case 9:
			System.out.println("Eylul");
			break;
		case 10:
			System.out.println("Ekim");
			break;
		case 11:
			System.out.println("Kasim");
			break;
		case 12:
			System.out.println("Aralik");
			break;
		default:
			System.out.println("Lutfen gecerli bir sayi giriniz");

		}

		scan.close();
	}

}
