package day36_inheritance;

import java.util.ArrayList;
import java.util.List;

public class Ustabasi extends Ýsci {
	
	public String bolum="takimhane";
	public int sorOldIscisay=20;

	public static void main(String[] args) {
		
		Ustabasi ub1 = new Ustabasi();
		
		System.out.println(ub1.bolum);
		System.out.println(ub1.sorOldIscisay);
		System.out.println(ub1.saatUcreti);
		System.out.println(ub1.isim);

		
		//List <String> list = new ArrayList <>();
		//Object str = new String("Hasan");
		Ýsci ub2 = new Ustabasi();
		
		System.out.println(ub2.departman);
		System.out.println(ub2.izindeMi);
	
		Personel ub3 = new Ustabasi();
		
		System.out.println(ub3.id);
	}

}
