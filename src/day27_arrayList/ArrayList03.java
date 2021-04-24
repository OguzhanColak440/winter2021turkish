package day27_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList03 {

	public static void main(String[] args) {
		// Kullanýcýdan bir pozitif tam sayý alýn 
		// aldýgýnýz sayýdan kücük olan fibonacci dizisi elemanlarýný yazdýrýn
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lütfen pozitif bir tam sayý giriniz");
		int sayý=scan.nextInt();
		
		
		List<Integer> fibo = new ArrayList <>();
		
		fibo.add(1);
		fibo.add(1);
		
		System.out.println(fibo);
		
		System.out.println(fibo.get(0) + fibo.get(1));
		
		for (int i = 2; fibo.get(i-2)+fibo.get(i-1) < sayý; i++) {
			
			fibo.add(fibo.get(i-2)+fibo.get(i-1));
			
		}
		System.out.println(fibo);

	}

}
