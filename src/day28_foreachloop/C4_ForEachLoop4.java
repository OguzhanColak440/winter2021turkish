package day28_foreachloop;

import java.util.ArrayList;
import java.util.List;

public class C4_ForEachLoop4 {

	public static void main(String[] args) {
		
		
		String arr1[]= {"Ali" , "Can" , "Ayse", "Seher"};
		String arr2[]= {"Ali" , "Veli" , "Mesut", "Seher","Sedat"};
		
		List<String> ortakElemanlar = new ArrayList<>();
		
		for (String eachArr1 : arr1) {
			for (String eachArr2 : arr2) {
				
			if	(eachArr1.equals(eachArr2)){
				
				ortakElemanlar.add(eachArr1);
				
			}
				
				
			}
			
		}
			System.out.println(ortakElemanlar);
		}

	}

