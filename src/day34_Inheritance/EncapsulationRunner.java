package day34_Inheritance;

public class EncapsulationRunner {

	public static void main(String[] args) {
		
		Encapsulation obj1 = new Encapsulation();
		System.out.println(obj1.getOkulIsm�());
		System.out.println(obj1.getOkulHesapNo());
		System.out.println(obj1.getOkulAc�kM�());
		
		
		obj1.setOkulIsm�("Mehmet Koleji");
		System.out.println(obj1.getOkulIsm�());
		
		Encapsulation obj2 = new Encapsulation();
		System.out.println(obj2.getOkulIsm�());
	}

}
