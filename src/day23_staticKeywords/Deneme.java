package day23_staticKeywords;
public class Deneme {
    int x;
    static int y;
    
    Deneme (int i) {
        x+=i;
        y+=i;
    }
    @SuppressWarnings("static-access")
	public static void main(String[] args) {
        
        new Deneme(2) ; 
        Deneme dnm = new Deneme(3);
        System.out.println(dnm.x + "," +dnm.y);
        
    }
}

