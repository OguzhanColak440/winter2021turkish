package day02;

import java.util.Scanner;

public class C2_Scanner2 {
public static void main(String[] args) {

	
	Scanner scan = new Scanner (System.in);
System.out.println("dairenin yarý çapýný giriniz");

  double  daire=scan.nextDouble();
  
  System.out.println(daire*daire);
  
  scan.close();


}
}
