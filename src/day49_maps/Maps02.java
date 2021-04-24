package day49_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Maps02 {

	public static void main(String[] args) {
		
	
		//Verilen bir String’deki harfleri ve harflerin kacar kez
		//kullanildigini return eden bir method yaziniz
		
		String input="Hellooo";
		Map<String,Integer>methoddanGelenMap = harfSayýsýBul(input);
		
		System.out.println(methoddanGelenMap);
		
		

	}

	public static Map<String, Integer> harfSayýsýBul(String input) {
		
		String harfler[] = input.split("");
		System.out.println(Arrays.toString(harfler));
		
		Map<String,Integer>harfKullanýmSayýsý=new HashMap<>();
		
		for (String each : harfler) {
			
			if (!harfKullanýmSayýsý.containsKey(each)) {
				harfKullanýmSayýsý.put(each, 1);
		
			} else {
				harfKullanýmSayýsý.put(each, harfKullanýmSayýsý.get(each)+1);
				
			}
			
			
			
		}
		
		return harfKullanýmSayýsý;
	}

}
