package day09_ternary;

import java.util.Scanner;

public class C4_ternary4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("L�tfen bir tam say� giriniz");
		
		int say�=scan.nextInt();
		
		System.out.println(say�%2==0 ? "ciftsay�" : "tek say�");
		
	  System.out.println(say�>0 ? say� : -say�);
		
		scan.close();
		
				
	}

}
