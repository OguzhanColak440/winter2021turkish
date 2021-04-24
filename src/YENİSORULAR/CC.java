package YENÝSORULAR;

public class CC {

	public static void main(String[] args) {
	
     /* String string = "";
     int count1 = 0;
     while (count1 <= 5) {
         string = string + "*";
         
         System.out.println(string);
          count1++;
       */   
           
           
        
           for(int i =0; i<=5; i++) {
               
           
           for(int j=1; j<=5-i; j++) {
               System.out.print(" ");
               
           }
           for (int k = 0; k<i; k++) {
               System.out.print("*");
              
          }
           System.out.println("");
           
  }
      }
}
  
	


