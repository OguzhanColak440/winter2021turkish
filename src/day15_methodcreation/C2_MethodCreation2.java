package day15_methodcreation;

import java.util.Scanner;

public class C2_MethodCreation2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lütfen kac sayý toplamak istediginizi girin");
		
		int adet=scan.nextInt();
		
        if (adet<2) {
			
        	System.out.println("en az 2 sayý girmelisiniz");
	
        } else if (adet==2) {
             
			ikiSayiTopla();
			
		}else if (adet==3) {
			
			ucSayýTopla();
		
		}else if (adet==4) {
			
			dortSayýTopla();
		
		}else {
			System.out.println("Cok sayý girdiniz ben toplayamam");
		scan.close();
		}
	}

	public static void dortSayýTopla() {
		
		Scanner scan=new Scanner (System.in);
		System.out.println("lütfen 4 sayý yazýnýz");
		double sayý1=scan.nextDouble();
		double sayý2=scan.nextDouble();
		double sayý3=scan.nextDouble();
		double sayý4=scan.nextDouble();
		System.out.println("4 sayýnýn toplamý : " +(sayý1+sayý2+sayý3+sayý4));
		
		scan.close();
		
		
		
	}

	public static void ucSayýTopla() {
		
		Scanner scan=new Scanner (System.in);
		System.out.println("lütfen toplamak istediginiz adedi yazýnýz");
		double sayý1=scan.nextDouble();
		double sayý2=scan.nextDouble();
		double sayý3=scan.nextDouble();
		
		System.out.println("3 sayýnýn toplamý : " +(sayý1+sayý2+sayý3));
		scan.close();
		
		
	}

	public static void ikiSayiTopla() {
		
		Scanner scan=new Scanner (System.in);
		System.out.println("lütfen toplamak istediginiz adedi yazýnýz");
		
		double sayý1=scan.nextDouble();
		double sayý2=scan.nextDouble();	
		
		System.out.println("2 sayýnýn toplamý : " +(sayý1+sayý2));
		scan.close();
		
		
		
		
	}
 
	
		
	}
	

