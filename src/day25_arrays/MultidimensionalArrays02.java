package day25_arrays;

public class MultidimensionalArrays02 {

	public static void main(String[] args) {
		//Verilen iki katl� bir araay in t�m elemanlar�n� toplam�n� bulal�m
		
		int arr[][]= {{1,2,3},{5,8},{9,6,5,1}};
		
		int toplam=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				
				toplam+=arr[i][j];
			}
			
			
		}
		
		System.out.println("arrayin i�indeki t�m elemanlar�n toplam� : " + toplam);
		

	}

}
