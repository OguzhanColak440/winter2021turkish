package day27_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList03 {

	public static void main(String[] args) {
		// Kullan�c�dan bir pozitif tam say� al�n 
		// ald�g�n�z say�dan k�c�k olan fibonacci dizisi elemanlar�n� yazd�r�n
		
		Scanner scan = new Scanner (System.in);
		System.out.println("L�tfen pozitif bir tam say� giriniz");
		int say�=scan.nextInt();
		
		
		List<Integer> fibo = new ArrayList <>();
		
		fibo.add(1);
		fibo.add(1);
		
		System.out.println(fibo);
		
		System.out.println(fibo.get(0) + fibo.get(1));
		
		for (int i = 2; fibo.get(i-2)+fibo.get(i-1) < say�; i++) {
			
			fibo.add(fibo.get(i-2)+fibo.get(i-1));
			
		}
		System.out.println(fibo);

	}

}
