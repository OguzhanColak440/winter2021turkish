package day09_ternary;

public class C1_ternary1 {

	public static void main(String[] args) {
		
		int say�=100;
		
		
		// ternary islemi bir sonuc dondurdugunden bir variable
		// olusturup ona assignment etmeliyiz
		
		String sonuc = say�%2==0 ? "cift say�" : "tek say�";
		System.out.println(sonuc);
		
		// ben bir variableye assign etmek istemezsem
		
		// syso icine yazabilirim
		
		System.out.println(say�%2==0 ? "cift say�" : "tek say�");
		
		// basina ac�klama yazmak istersem

		
		System.out.println("i�lem sonucu : " + (say�%2==0 ? "cift say�" : "tek say�"));
	}

}
