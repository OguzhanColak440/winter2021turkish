package day09_ternary;

import java.util.Scanner;

public class C4_ternary4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Lütfen bir tam sayý giriniz");
		
		int sayý=scan.nextInt();
		
		System.out.println(sayý%2==0 ? "ciftsayý" : "tek sayý");
		
	  System.out.println(sayý>0 ? sayý : -sayý);
		
		scan.close();
		
				
	}

}
