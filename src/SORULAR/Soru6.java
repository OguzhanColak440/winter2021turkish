package SORULAR;

import java.util.Scanner;

public class Soru6 {

	public static void main(String[] args) {
		

        //1.Yol: StringBuilder () kullanarak
        //2.Yol: String Classini kullanarak
        //3.Yol: Bir method oluþturun, ardýndan methodu main method dan çaðýrýn   */
		
		
		System.out.println(methodStr());
		
		
	     Scanner scan=new Scanner(System.in);
		System.out.print("Please enter a string :");
		String sentence=scan.nextLine();
		String reverseOfSentence="";
		for(int i=sentence.length()-1;i>=0;i--) {
			reverseOfSentence+=sentence.charAt(i);
			
			
		}
		System.out.println(reverseOfSentence);        
		
		
		
		StringBuilder sentence1= new StringBuilder("Javayi seviyoruz.");
		
	
		sentence1.reverse();
		System.out.println(sentence1);              
		
		
		
	
		
		
		
		
		
	}
	private static String methodStr() {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Please enter a string :");
		String sentence=scan.nextLine();
		String reverseOfSentence="";
		for(int i=sentence.length()-1;i>=0;i--) {
			reverseOfSentence+=sentence.charAt(i);
			
			
		}
		
		return reverseOfSentence;
}
}
