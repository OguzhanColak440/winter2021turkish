package day34_Inheritance;

public class Encapsulation {

	
	private String okulIsmý = "Yýldýz Koleji";
	private int okulHesapNo = 12345;	
	private boolean okulAcýkMý = true;
	
	
	public String getOkulIsmý() {
		return okulIsmý;
	}
			
	public 	int getOkulHesapNo () {
		return okulHesapNo;
	}

	public boolean getOkulAcýkMý () {
		return okulAcýkMý;
	}
    
	public void setOkulIsmý(String okulIsmý) {
		this.okulIsmý=okulIsmý;
	}
}
