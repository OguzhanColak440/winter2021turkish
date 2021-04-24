package day49_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Maps02 {

	public static void main(String[] args) {
		
	
		//Verilen bir String�deki harfleri ve harflerin kacar kez
		//kullanildigini return eden bir method yaziniz
		
		String input="Hellooo";
		Map<String,Integer>methoddanGelenMap = harfSay�s�Bul(input);
		
		System.out.println(methoddanGelenMap);
		
		

	}

	public static Map<String, Integer> harfSay�s�Bul(String input) {
		
		String harfler[] = input.split("");
		System.out.println(Arrays.toString(harfler));
		
		Map<String,Integer>harfKullan�mSay�s�=new HashMap<>();
		
		for (String each : harfler) {
			
			if (!harfKullan�mSay�s�.containsKey(each)) {
				harfKullan�mSay�s�.put(each, 1);
		
			} else {
				harfKullan�mSay�s�.put(each, harfKullan�mSay�s�.get(each)+1);
				
			}
			
			
			
		}
		
		return harfKullan�mSay�s�;
	}

}
