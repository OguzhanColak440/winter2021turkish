package day42_abstractclasses;

public class Isc� extends Personel {

	public static void main(String[] args) {
		
		
		Isc� isci1 = new Isc�();
		isci1.maasHesapla();
		isci1.mesaiBilgisi();
		isci1.isim="Rumeysa";
		System.out.println(isci1.isim);
		isci1.ozelSigorta();
		

	}

	@Override
	public void maasHesapla() {
		// TODO Auto-generated method stub
		
		
		System.out.println("�sciler icin maas 5000 tl");
		
	}

	@Override
	public void mesaiBilgisi() {
		// TODO Auto-generated method stub
		
		System.out.println("�sciler g�nl�k 8 saat cal�s�r");
		
	}

}
