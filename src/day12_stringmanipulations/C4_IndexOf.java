package day12_stringmanipulations;

import java.util.Scanner;

public class C4_IndexOf {

	public static void main(String[] args) {
		
		String str = "Java ogren, is sahibi ol";
		
		System.out.println(str.charAt(6));
		
		System.out.println("char arama : " +str.indexOf('g'));
		
		System.out.println("string arama : " +str.indexOf("g"));
		
		System.out.println("String kelime arama : " + str.indexOf("is"));

		
		System.out.println("birden fazla varsa  : " + str.indexOf('i'));
		
		str.indexOf('a', 4);
		
		System.out.println("baslangýc indexi ile : " + str.indexOf('a', 4));
	
	
	
	 Scanner scan=new Scanner (System.in);
	 
	 System.out.println("Lütfen bir cumle giriniz");
	 
	 String cumle = scan.nextLine().toLowerCase();
	 
	 int sonuc=cumle.indexOf("chn");
	 
	 System.out.println(sonuc==-1 ? "java icermiyor " : "Java iceriyor" );
	 
	 
	 scan.close();

	}
	 
	 
	 
	 
	}


