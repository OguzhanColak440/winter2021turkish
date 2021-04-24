package day29_PassByValueimmutable;

public class C6_Immutable03 {

	public static void main(String[] args) {
		
		String isim ="";
		
		for (int i = 0; i < 10; i++) {
			isim=isim+i;
			System.out.println(isim);
			
		}
		System.out.println("====================");
        System.out.println(isim);
	}

}
