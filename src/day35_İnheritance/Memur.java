package day35_Ýnheritance;

public class Memur extends Personel {

	public int maas;

	
	public Memur() {
		super();
		System.out.println("Child class parametresiz constructor calýstý");
	}
	


	
	
	
	
	public Memur(int maas) {

		
		System.out.println("Child class parametreli constructor calýstý");
		
		
	
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Memur obj1 = new Memur (2400);

	}

}
