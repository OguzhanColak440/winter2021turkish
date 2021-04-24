package day17_forLoop;

import java.util.Scanner;

public class C4_NestedForLoop {

	public static void main(String[] args) {
 
		 /*
		  * kullanýcýdan bir pozitif rakam girmesini isteyin
		  * 
		  * 
		  */
		Scanner scan=new Scanner (System.in);
		System.out.println("bir pozitif tam sayý girin");
		int sayý=scan.nextInt();
		
		for (int i = 0; i <sayý; i++) {
			System.out.println(" ");
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
		}
		
	}

}
