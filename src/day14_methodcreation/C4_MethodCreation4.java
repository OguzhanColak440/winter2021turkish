package day14_methodcreation;

public class C4_MethodCreation4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       toplama("Ali", "veli");
	}
	
	public static void toplama(int say�1, int say�2) {
		System.out.println("int method sonucu : " + (say�1+say�2) );
	}

	public static void toplama(double say�1, double say�2) {
		System.out.println("double method sonucu : " + (say�1+say�2) );
}
 
	public static void toplama(int say�1, double say�2) {
		System.out.println("int double method sonucu : " + (say�1+say�2) ); 

}

	public static void toplama(char char1, char char2) {
		System.out.println("int method sonucu : " + (char1+char2) );
}
	
	public static void toplama(String str1, String str2) {
		System.out.println("int method sonucu : " + (str1+str2) );
}
	}