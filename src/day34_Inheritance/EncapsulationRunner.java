package day34_Inheritance;

public class EncapsulationRunner {

	public static void main(String[] args) {
		
		Encapsulation obj1 = new Encapsulation();
		System.out.println(obj1.getOkulIsmý());
		System.out.println(obj1.getOkulHesapNo());
		System.out.println(obj1.getOkulAcýkMý());
		
		
		obj1.setOkulIsmý("Mehmet Koleji");
		System.out.println(obj1.getOkulIsmý());
		
		Encapsulation obj2 = new Encapsulation();
		System.out.println(obj2.getOkulIsmý());
	}

}
