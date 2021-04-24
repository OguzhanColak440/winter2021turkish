package day44_iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator03 {

	public static void main(String[] args) {
		
		/*
		 * Bir listedeki istenen sayi araliginda olmayan elementleri
		 *  silen bir program yaziniz … (2. liste olusturmadan, 
		 *  gecerli liste uzerinde islem yapiniz)
 Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil)
 output: [23,40]
		 */
		
		List<Integer> lisy=new ArrayList<>();
		
		lisy.add(2);
		lisy.add(13);
		lisy.add(56);
		lisy.add(23);
		lisy.add(45);
		lisy.add(14);
		lisy.add(40);
		
		ListIterator li1=lisy.listIterator();
		
		while(li1.hasNext()) {
			
			int temp=(int) li1.next();
			
		     if (temp<20 || temp>40) {
		    	 li1.remove();
				
			}
		
		}
	
			System.out.println(lisy);
		
		

	}

}
