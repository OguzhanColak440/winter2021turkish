package day34_Inheritance;

public class EncapsulationRunner {

	public static void main(String[] args) {
		
		Encapsulation obj1 = new Encapsulation();
		System.out.println(obj1.getOkulIsmı());
		System.out.println(obj1.getOkulHesapNo());
		System.out.println(obj1.getOkulAcıkMı());
		
		
		obj1.setOkulIsmı("Mehmet Koleji");
		System.out.println(obj1.getOkulIsmı());
		
		Encapsulation obj2 = new Encapsulation();
		System.out.println(obj2.getOkulIsmı());
	}

}
