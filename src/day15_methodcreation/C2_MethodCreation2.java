package day15_methodcreation;

import java.util.Scanner;

public class C2_MethodCreation2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("L�tfen kac say� toplamak istediginizi girin");
		
		int adet=scan.nextInt();
		
        if (adet<2) {
			
        	System.out.println("en az 2 say� girmelisiniz");
	
        } else if (adet==2) {
             
			ikiSayiTopla();
			
		}else if (adet==3) {
			
			ucSay�Topla();
		
		}else if (adet==4) {
			
			dortSay�Topla();
		
		}else {
			System.out.println("Cok say� girdiniz ben toplayamam");
		scan.close();
		}
	}

	public static void dortSay�Topla() {
		
		Scanner scan=new Scanner (System.in);
		System.out.println("l�tfen 4 say� yaz�n�z");
		double say�1=scan.nextDouble();
		double say�2=scan.nextDouble();
		double say�3=scan.nextDouble();
		double say�4=scan.nextDouble();
		System.out.println("4 say�n�n toplam� : " +(say�1+say�2+say�3+say�4));
		
		scan.close();
		
		
		
	}

	public static void ucSay�Topla() {
		
		Scanner scan=new Scanner (System.in);
		System.out.println("l�tfen toplamak istediginiz adedi yaz�n�z");
		double say�1=scan.nextDouble();
		double say�2=scan.nextDouble();
		double say�3=scan.nextDouble();
		
		System.out.println("3 say�n�n toplam� : " +(say�1+say�2+say�3));
		scan.close();
		
		
	}

	public static void ikiSayiTopla() {
		
		Scanner scan=new Scanner (System.in);
		System.out.println("l�tfen toplamak istediginiz adedi yaz�n�z");
		
		double say�1=scan.nextDouble();
		double say�2=scan.nextDouble();	
		
		System.out.println("2 say�n�n toplam� : " +(say�1+say�2));
		scan.close();
		
		
		
		
	}
 
	
		
	}
	

