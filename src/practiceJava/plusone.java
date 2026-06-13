package practiceJava;

import java.util.Arrays;

public class plusone {

	public static void main(String[] args) {
		int[] a = {1,2,3};
		int result = 0; 
		for(int i=0;i<=a.length-1;i++) {
			result=result*10+a[i];
			
			//result = result+1;
		}
		result = result+1;
	int[] b =String.valueOf(result).chars().map(c->c-'0').toArray();
       System.out.println(Arrays.toString(b));
	}

}
