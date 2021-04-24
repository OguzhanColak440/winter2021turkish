package day42_abstractclasses;

public class Iscý extends Personel {

	public static void main(String[] args) {
		
		
		Iscý isci1 = new Iscý();
		isci1.maasHesapla();
		isci1.mesaiBilgisi();
		isci1.isim="Rumeysa";
		System.out.println(isci1.isim);
		isci1.ozelSigorta();
		

	}

	@Override
	public void maasHesapla() {
		// TODO Auto-generated method stub
		
		
		System.out.println("Ýsciler icin maas 5000 tl");
		
	}

	@Override
	public void mesaiBilgisi() {
		// TODO Auto-generated method stub
		
		System.out.println("Ýsciler günlük 8 saat calýsýr");
		
	}

}
