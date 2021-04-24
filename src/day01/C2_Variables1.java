package day01;

public class C2_Variables1 {

	public static void main(String[] args) {
	    
        int sayi; // ; yazim dilindeki . gibidir. java ;'u gorunce o satirdaki kod yaziliminin bittigini anlar
        sayi=27;
        
        System.out.print(sayi); // eger println degil de print yazarsak yazdirma isleminden
          System.out.println(sayi);                      // sonra alt satira gecmez
     
        char ilkHarf='M';
        
        System.out.println(ilkHarf); // println yazinca yazma isleminden sonra alt satira gecer
        
        double sayiDouble = 5.34;
        
        System.out.println(sayiDouble);
        
        System.out.println(sayi + sayiDouble); // 32.34
        
    
        // Eger bir toplama isleminde char degisken kullanilirsa karakterin Ascii degeri ile toplama yapar

	}

}
