package day16_forLoop;

import java.util.Scanner;

public class C2_ForLoop2 {

	public static void main(String[] args) {
		// Kullan�c�dan 2 tam say� al�n
		//ilk say�dan ikinci say�ya kadar t�m tam say�lar� yan yana
		// aralar�nda bosluk olarak yazd�r�n
		
	      // kullanicidan 2 tamsayi alin
        // ilk sayidan, ikinci sayiya kadar tum tamsayilari
        // yanyana aralarinda bosluk olarak yazdirin
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 2 pozitif tamsayi giriniz");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
        
        if (sayi1>sayi2) {
            
            for (int i = sayi1; i >=sayi2; i--) {
                System.out.print(i + " ");
            }
            
            
        } else { // sayi1<=sayi2
            
            for (int i = sayi1; i <= sayi2; i++) {
                System.out.print(i + " ");
            }
        }
    scan.close();
	}
}
