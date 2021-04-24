package day14_methodcreation;

public class C3_MethodCreation3 {

	public static void main(String[] args) {
	
      ortalama(80,60);
      ortalama(80,60,55);
	} // main metot sonu

	public static void ortalama (double sayý1, double sayý2, double sayý3) {
		System.out.println("girdiginiz sayýnýn ortalamasý : " + (sayý1+sayý2+sayý3)/3 );
	}
	
	 public static void ortalama(double sayi1, double sayi2) {
         
         System.out.println("girdiginiz iki sayinin ortalamasi : " + (sayi1+sayi2)/2);


} // class sonu

}