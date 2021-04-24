package SORULAR;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Class01 {

	public static void main(String[] args) {
	
		/*
        Get numbers from the user and output that number consecutive fibonacci number sequence
                e.g : User enters 10
        output : 0 1  12  3  5 8 13 21 34
                */

		
		int array[]= new int [10];
		
		// index olarak = 0=0
		             //   1=0
		array[0]=0;
		array[1]=1;
		
		
	
		
		for (int i = 2; i < array.length; i++) {
			 {
				
			}
			{
				
				array[i]= array[i-1]+array[i-2];
				
				
			}
			
		}System.out.println(Arrays.toString(array));
		
		
		
		
		
	}

}
