package SORULAR;

public class CC {

	public static void main(String[] args) {
	
		   String str = "ilovejavatoo";
	        String tEden = "";
	      
	        for(int i=0; i<str.length();i++) {
	            for(int j=i+1; j<str.length();j++) {
	             
	            	if(str.charAt(i)==str.charAt(j) &&      !(tEden.contains(str.substring(i, i+1)))) {
	              
	            		tEden+= str.charAt(i);
	                  
	            		System.out.print(str.charAt(i) + " ");
	                    }
	                }
	           
}
	}
}