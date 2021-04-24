package day29_PassByValueimmutable;

public class C5_Immutable02 {

	public static void main(String[] args) {
		
		String isim = "Ali";
		
		isim=isim+"";
		System.out.println(isim.equals("Ali"));
		System.out.println(isim=="Ali");
		
		String str1 = new String ("Mehmet");
		String str2 = new String ("Mehmet");
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		String str3 = "Mehmet";
		String str4 = "Mehmet";
		
		
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
		
		
		
		System.out.println(str3==str1);
		System.out.println(str3.equals(str1));
		
		
		
		

	}

}
