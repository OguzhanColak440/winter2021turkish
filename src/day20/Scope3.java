package day20;

public class Scope3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
		        // ben farkli class'lardan da Scope1 class'ina object olusturarak ulasabilirim
		        
		        Scope1 obj4 = new Scope1();
		        System.out.println(obj4.isim);
		        System.out.println(obj4.soyisim);
		        
		        obj4.soyisim="Can";
		        obj4.isim="Ahmet";
		        
		        System.out.println(obj4.isim + " " + obj4.soyisim);
		        
		        
		        Scope1 obj5 = new Scope1 ();
		        
		        obj5.isim="Oðuzhan";
		        obj5.soyisim="Colak";
		        
		        System.out.println(obj5.isim + " " + obj5.soyisim);
		        
		        
		    }
		
	}


