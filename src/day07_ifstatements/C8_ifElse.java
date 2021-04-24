package day07_ifstatements;

import java.util.Scanner;

public class C8_ifElse {
public static void main(String[] args) {
	
	
	Scanner scan=new Scanner (System.in);
	
	System.out.println("Lütfen maas teklifi veriniz");
	
	double  rakam=scan.nextDouble();
	if (rakam<60000) {
		System.out.println("üzgünüm kabul edemem");
	} 
	
	else if  (rakam<80000){
		System.out.println("Konusabiliriz");
	}
	
	else if  (rakam>=80000){
		System.out.println("kabul ediyorum");
	}
	
	else {
		System.out.println("Kabul ediyorum");
	}
			
	
	scan.close();
	

}
}
