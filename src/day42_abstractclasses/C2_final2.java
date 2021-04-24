package day42_abstractclasses;

public class C2_final2 {
	
	final static int SAYI=10;
	
	String isim;
	
	//Instance variablellara ilk deger atamasý yapmak zorunda deðiliz
	// Deðer atamadýgýmýzda Java data türüne göre default deðerler atar
	
	 // final String soyisim;
	
	//Final variabllerin deðeri sonradan deðiþtirilemeyeceði için ilk atama yapýlmadan
	//olusturulmasýna java izin vermez

	public static void main(String[] args) {
		

		System.out.println(SAYI);
		System.out.println(Integer.MAX_VALUE);
	}
	
	public void deneme() {
		System.out.println();
	}

}
