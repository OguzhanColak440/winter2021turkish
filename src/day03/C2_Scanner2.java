package day03;

import java.util.Scanner;

public class C2_Scanner2 {
public static void main(String[] args) {
	Scanner scan=new Scanner (System.in);
	
	System.out.println("L�tfen isminizi giriniz");
	char ilkHarf = scan.next().toUpperCase().charAt(0);
	//stringde harflerin indeksleri 0 dan baslar
	// biz ilk harfi istedi�imiz i�in index olarak 0 girmeliyiz
System.out.println("bas harfiniz : "  + ilkHarf);

//charAt (o) yazd�ktan sonra . koyarsak methodlar gelmez
//cunku char At (0) methodu kullan�l�nca variablemizi char yapm�s oluruz
//char primitive data tipindedir ve
// primitive data tipleri methodlara sahip degildir
scan.close();

	
}
}
