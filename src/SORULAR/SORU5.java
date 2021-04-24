package SORULAR;

import java.util.Arrays;
import java.util.Scanner;

public class SORU5 {

	public static void main(String[] args) {


		 /*
         * SORU 3) Kullanicidan 100 den kucuk bir tamsayi isteyip, bu sayinin daha
         * onceden tanimlanmis array’de olup olmadigini kullaniciya donen bir method
         * yaziniz
         *
         * Array={3,5,21,32,34,45,56,57,76,87,95}
         *
         * Input : 5  Output: Girdiginiz sayi Arrayde var
         * Input : 15 Output: Girdiginiz sayi Arrayde yok
         */

		Scanner scan = new Scanner (System.in);
		System.out.println("Lütfen Arrayda aradýðýnýz sayýyý giriniz");
		int sayý=scan.nextInt();
		
		int arr1[]= {1,3,5,10,20,64,22};
		
		
		methodBey(arr1, sayý);
		 
			
		
		
		
		
		
		

	}

	public static void methodBey(int arr[] , int sayý) {
		
		String flag="Yok";
		
		for (int each : arr) {
			if (each==sayý) {
				flag="Var";
			}
			
		}
		System.out.println("Aradýgýnýz sayý arrayde : " + flag );
	
		

			} 
		
			
		}
		
		
	
	
		

	


