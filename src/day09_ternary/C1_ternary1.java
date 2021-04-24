package day09_ternary;

public class C1_ternary1 {

	public static void main(String[] args) {
		
		int sayı=100;
		
		
		// ternary islemi bir sonuc dondurdugunden bir variable
		// olusturup ona assignment etmeliyiz
		
		String sonuc = sayı%2==0 ? "cift sayı" : "tek sayı";
		System.out.println(sonuc);
		
		// ben bir variableye assign etmek istemezsem
		
		// syso icine yazabilirim
		
		System.out.println(sayı%2==0 ? "cift sayı" : "tek sayı");
		
		// basina acıklama yazmak istersem

		
		System.out.println("işlem sonucu : " + (sayı%2==0 ? "cift sayı" : "tek sayı"));
	}

}
