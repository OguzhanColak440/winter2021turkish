package day35_�nheritance;

public class Memur extends Personel {

	public int maas;

	
	public Memur() {
		super();
		System.out.println("Child class parametresiz constructor cal�st�");
	}
	


	
	
	
	
	public Memur(int maas) {

		
		System.out.println("Child class parametreli constructor cal�st�");
		
		
	
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Memur obj1 = new Memur (2400);

	}

}
