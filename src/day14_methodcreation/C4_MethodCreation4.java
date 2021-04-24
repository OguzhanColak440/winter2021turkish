package day14_methodcreation;

public class C4_MethodCreation4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       toplama("Ali", "veli");
	}
	
	public static void toplama(int sayý1, int sayý2) {
		System.out.println("int method sonucu : " + (sayý1+sayý2) );
	}

	public static void toplama(double sayý1, double sayý2) {
		System.out.println("double method sonucu : " + (sayý1+sayý2) );
}
 
	public static void toplama(int sayý1, double sayý2) {
		System.out.println("int double method sonucu : " + (sayý1+sayý2) ); 

}

	public static void toplama(char char1, char char2) {
		System.out.println("int method sonucu : " + (char1+char2) );
}
	
	public static void toplama(String str1, String str2) {
		System.out.println("int method sonucu : " + (str1+str2) );
}
	}