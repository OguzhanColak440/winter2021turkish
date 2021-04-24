package day16_forLoop;

import java.util.Scanner;

public class C5_ForLoop5 {

	public static void main(String[] args) {
	
        // Kullanicidan 100’den kucuk bir tamsayi isteyin.
        // 1’ baslayarak girilen sayýya kadar tum sayilari yazdirin. Fakat;
        // Sayi 3'un kati ise "Java"Yazdýrýn.
        // Sayi 5'un kati ise "Guzeldir"Yazdýrýn.
        // Sayi Hem 3'un Hem 5'in  kati ise "Java Guzeldir "Yazdýrýn.
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 100'den Kucuk bir Sayi Girin");
        int sayi = scan.nextInt();
        ucerliBeserliSayma(sayi);
        scan.close();
    }
    public static void ucerliBeserliSayma(int sayi) {
        if (sayi < 0 || sayi > 100) {
            System.out.println("Girilen Sayi istenen aralikta Degil");
        } else {
            for (int i = 1; i <= sayi; i++) {
                if (i%3==0 && i%5==0) {
                    System.out.println(i+" Java Guzeldir");
                } else  if (i%5==0) {
                    System.out.println(i+" Guzeldir");
                } else if (i%3==0) {
                    System.out.println(i+" Java");
                } else if (i<sayi) {
                    System.out.println(i);
                }
            }
            
        }
        
    }
}
