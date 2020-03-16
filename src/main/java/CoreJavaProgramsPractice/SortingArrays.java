package CoreJavaProgramsPractice;

import java.util.*;

public class SortingArrays {

	public static void main(String[] args) {
		int a[] = { 1, 4, 2, 3 };
		int temp = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}

		for (int k : a) {
			System.out.println(k);
		}
		
		//Sorting String arrays
		String[] str= {"Lucky","vardhan","harsha","harika"};
         Collections.sort( Arrays.asList(str));
         for(String s : str)
         {
        	 System.out.println(s);
         }
	
	}
}
