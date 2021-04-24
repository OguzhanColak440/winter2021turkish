package day49_maps;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map04_Veritabaný {

	public static void main(String[] args) {
		
		String dosyaYolu="C:\\Users\\hp\\Desktop\\Veritabaný.csv";
		
		
		Map<String,String> veriMap = veriTabaniAl(dosyaYolu);
 
	}

	public static Map<String, String> veriTabaniAl(String dosyaYolu) {
	
		Map<String,String> eklenecekMap = new HashMap<>();
		List<String> tempList=new ArrayList<>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader (dosyaYolu));
			String satir=br.readLine();
			
			while(satir!= null) {
				tempList.add(satir);
				satir=br.readLine();
			}
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		System.out.println(tempList);
		
		return eklenecekMap;
	}

}
