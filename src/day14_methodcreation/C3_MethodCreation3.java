package day14_methodcreation;

public class C3_MethodCreation3 {

	public static void main(String[] args) {
	
      ortalama(80,60);
      ortalama(80,60,55);
	} // main metot sonu

	public static void ortalama (double say�1, double say�2, double say�3) {
		System.out.println("girdiginiz say�n�n ortalamas� : " + (say�1+say�2+say�3)/3 );
	}
	
	 public static void ortalama(double sayi1, double sayi2) {
         
         System.out.println("girdiginiz iki sayinin ortalamasi : " + (sayi1+sayi2)/2);


} // class sonu

}