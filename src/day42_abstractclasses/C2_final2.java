package day42_abstractclasses;

public class C2_final2 {
	
	final static int SAYI=10;
	
	String isim;
	
	//Instance variablellara ilk deger atamas� yapmak zorunda de�iliz
	// De�er atamad�g�m�zda Java data t�r�ne g�re default de�erler atar
	
	 // final String soyisim;
	
	//Final variabllerin de�eri sonradan de�i�tirilemeyece�i i�in ilk atama yap�lmadan
	//olusturulmas�na java izin vermez

	public static void main(String[] args) {
		

		System.out.println(SAYI);
		System.out.println(Integer.MAX_VALUE);
	}
	
	public void deneme() {
		System.out.println();
	}

}
