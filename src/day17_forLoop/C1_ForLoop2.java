package day17_forLoop;

import java.util.Scanner;

public class C1_ForLoop2 {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen bir adet tam sayi giriniz");
		int sayi = scan.nextInt();
		
		if (sayi == 0 || sayi < 0) {
			System.out.println("Lutfen pozitif bir tam sayi giriniz");
		} else {
			rakamlarToplami(sayi);
		}
		
		System.out.println("Lutfen bir sinir deger belirleyin");
		int sinirDeger = scan.nextInt();
		
		if (rakamlarToplami(sayi) > sinirDeger) {
			System.out.println("Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk");
		}else {
			System.out.println("Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk degil");
		}
		
	}
	public static int rakamlarToplami(int sayi) {
		int rakamlarToplam = 0;
		String sayi2 = sayi+"";
		for (int i = 1; i < sayi2.length(); i++) {
			rakamlarToplam += sayi%10;
			sayi /= 10;
		}return rakamlarToplam;
		
	}

	}


