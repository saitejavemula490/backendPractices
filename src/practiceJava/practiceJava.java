package practiceJava;

import java.util.Arrays;

public class practiceJava {

	public static void main(String[] args) {
		int[] arr1 = {1,3,5,0};
		int[] arr2 = {2,6,8};
		
		//arr1 = Arrays.stream(arr1).filter(e->e!=0).toArray();
		int[] combined = new int[arr1.length + arr2.length];
		//System.out.println(Arrays.toString(arr1));
		 for (int i = 0; i < arr1.length; i++) {
	            combined[i] = arr1[i];
	        }
		 // Step 3: Copy elements from array2
        for (int i = 0; i < arr2.length; i++) {
            combined[arr1.length + i] = arr2[i];
        }
        
        combined = Arrays.stream(combined).filter(e->e!=0).toArray();
        Arrays.sort(combined);
		System.out.println(Arrays.toString(combined));
	}

}
