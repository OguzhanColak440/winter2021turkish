package day23_staticKeywords;

public class StaticBlock {
	
	static String isim;
	
	static {
		System.out.println("1nci static block cal�st�");
	}
	static {
		isim="Mehmet";
		System.out.println(isim);
	}

	
	public static void main(String[] args) {
		
		isim="Alican";
		System.out.println(isim);

	}

}
