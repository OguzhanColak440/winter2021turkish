package day24_Array;

public class Arrays03 {

	public static void main(String[] args) {
		// Verilen bir array in t�m elemanlar�n� toplayan bir program yaz
		
		int arr[]= {10,15,2,45,78};
		
		int toplam=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			toplam+=arr[i];
			
		}
		System.out.println(toplam);
		
		//Verilen array in t�m elemanlar�n� toString metodu olmadan yazd�r�n
		
		for (int i = 0; i < arr.length; i++) {
			 System.out.print(arr[i]+" ");
		}
	}

}
