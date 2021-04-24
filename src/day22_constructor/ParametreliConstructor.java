package day22_constructor;

public class ParametreliConstructor {
	
	
	public ParametreliConstructor (int yil) {
		
		this.yil=yil;
	}
	
	public ParametreliConstructor() {
		
	}
	
	public ParametreliConstructor(String Marka, String Model) {
		
	}
	
	public ParametreliConstructor(String marka, String model 
			, int yýl , boolean kazasýVarmý) {
		
		this.marka=marka;
		this.model=model;
		this.yil=yil;
		this.kazasiVarMi=kazasiVarMi;
		
	}
	
	
	  String marka;
	    String model;
	    int yil;
	    boolean kazasiVarMi;
	    
	    public void yakit(String yakit) { // method
	        System.out.println("Araba yakit olarak " + yakit  + " kullanir");
	    }
	    
	    public void vites(String vites) { // method
	        System.out.println("Araba " + vites + " viteslidir");
	        

}
}